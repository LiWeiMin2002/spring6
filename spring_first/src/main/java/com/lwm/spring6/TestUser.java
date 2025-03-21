package com.lwm.spring6;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author LWM
 * @Date 2025/3/21 16:02
 **/
public class TestUser {


    @Test
    public void testUserObject(){
        //加载spring配置文件，对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");


        //获取创建的对象
        User user = (User) context.getBean("user");
        System.out.println("1:"+user);


        //使用对象调研方法进行测试
        user.add();

    }






    //使用反射创建对象
    @Test
    public void testUserObject2()  {
        //获取类的Class对象
        Class clazz= null;
        try {
            clazz = Class.forName("com.lwm.spring6.User");
            //调用方法创建对象
            //Object object=clazz.newInstance();
            User user=(User) clazz.getDeclaredConstructor().newInstance();
            System.out.println(user);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


    }




}