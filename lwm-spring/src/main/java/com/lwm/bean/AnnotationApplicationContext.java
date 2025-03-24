package com.lwm.bean;

import com.lwm.anno.Bean;
import com.lwm.anno.Di;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * LWM
 * 2025/3/24 01:31
 **/
public class AnnotationApplicationContext implements ApplicationContext {

    //创建一个Map集合存放Bean对象
    private Map<Class, Object> beanFactory = new HashMap<Class, Object>();
    private String rootPath;


    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }


    //创建有参构造，传递包路径，设置包的扫描规则
    public AnnotationApplicationContext(String basePackage) {
        //    1.把com.lwm换成Com\lwm
        String packagePath = basePackage.replaceAll("\\.", "\\\\");
        //    2.获取绝对路径
        try {
            Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources(packagePath);
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                String filePath = URLDecoder.decode(url.getFile(), "UTF-8");
                //获取包前面路径部分
                rootPath = filePath.substring(0, filePath.length() - packagePath.length());
                //    包的扫描
                loadBean(new File(filePath));
                loadDi();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    //    包扫描的方法
    private void loadBean(File file) throws Exception {
        //bean的创建
        //   1.判断当前是否是文件夹
        if (file.isDirectory()) {
            //    2.获取文件夹里面的所有内容
            File[] childrenFiles = file.listFiles();
            //    3.判断文件夹是否为空
            if (childrenFiles == null || childrenFiles.length == 0) {
                return;
            }
            //    4.文件夹不为空，遍历文件夹所有内容
            for (File child : childrenFiles) {
                //    是文件夹，递归
                if (child.isDirectory()) {
                    loadBean(child);
                } else {
                    //    是文件，判断是否为.class类型，使用反射对.class文件有@Bean注解的类进行实例化，把实例化对象放入Map（beanFactory）集合中
                    String pathWithClass = child.getAbsolutePath().substring(rootPath.length() - 1);
                    //判断是否为.class文件
                    if (pathWithClass.endsWith(".class")) {
                        // 字符串处理
                        String allName = pathWithClass.replaceAll("\\\\", ".").replace(".class", "");
                        //获取类的Class
                        Class<?> clazz = Class.forName(allName);
                        //判断是否为接口
                        if (!clazz.isInterface()) {
                            // 判断是否有@Bean注解
                            Bean annotation = clazz.getAnnotation(Bean.class);
                            if (annotation != null) {
                                //实例化
                                Object instance = clazz.getConstructor().newInstance();
                                //将实例化对象放入Map集合中
                                //判断当前类是否有接口 让接口作为map的key
                                if (clazz.getInterfaces().length > 0) {
                                    beanFactory.put(clazz.getInterfaces()[0], instance);
                                } else {
                                    beanFactory.put(clazz, instance);
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    //    属性注入
    private void loadDi() {
        //实例化对象在beanFactory的Map集合中
        //1.遍历beanFactory的Map集合
        Set<Map.Entry<Class, Object>> entries = beanFactory.entrySet();
        for (Map.Entry<Class, Object> entry : entries) {
            //2.获取Map集合的每个对象（value），每个对象属性
            Object obj = entry.getValue();
            //获取对象Class
            Class<?> clazz = obj.getClass();
            //获取每个对象属性
            Field[] declaredFields = clazz.getDeclaredFields();
            //3.遍历得到的每个对象属性数组，得到每个属性
            for (Field field : declaredFields) {
                //4.判断属性上面是否有@Di注解
                Di di = field.getAnnotation(Di.class);
                if (di != null) {
                    //设置私有属性可以被修改
                    field.setAccessible(true);
                    try {
                        //5.如果有@Di注解，把对象进行注入
                        field.set(obj, beanFactory.get(field.getType()));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }


    }


}