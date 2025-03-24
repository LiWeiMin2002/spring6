package com.lwm.spring6.aop.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * LWM
 * 2025/3/24 12:54
 **/
public class ProxyFactory {


    //目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回代理对象
    public Object getProxy() {
        /**
         *  Proxy.newProxyInstance()方法，有三个参数
         *
         *  ClassLoader loader      加载动态生成代理类的类加载器
         *
         *  Class<?>[] interfaces   目标对象实现的所有接口的class类型的数组
         *
         *  InvocationHandler h     设置代理对象实现目标对象方法的过程
         */
        //ClassLoader loader      加载动态生成代理类的类加载器
        ClassLoader classLoader = target.getClass().getClassLoader();
        //Class<?>[] interfaces   目标对象实现的所有接口的class类型的数组
        Class<?>[] interfaces = target.getClass().getInterfaces();
        //InvocationHandler h     设置代理对象实现目标对象方法的过程
        InvocationHandler invocationHandler = new InvocationHandler() {
            /**
             *  invoke()方法
             *  Object proxy    代理对象
             *  Method method   需要重写的目标对象的方法
             *  Object[] args   method方法的参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("[动态代理][日志]" + method.getName() + ",参数：" + Arrays.toString(args));
                Object result = method.invoke(target, args);
                System.out.println("[动态代理][日志]" + method.getName() + ",结果：" + result);
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}