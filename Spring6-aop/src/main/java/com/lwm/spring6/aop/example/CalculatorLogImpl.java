package com.lwm.spring6.aop.example;

/**
 * LWM
 * 2025/3/24 11:41
 **/
public class CalculatorLogImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        System.out.println("[日志] add 方法开始了，参数是："+a+","+b);
        int result=a+b;
        System.out.println("方法内部 result = "+result);
        System.out.println("[日志] add 方法结束了，结果是："+result);
        return result;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("[日志] sub 方法开始了，参数是："+a+","+b);
        int result=a-b;
        System.out.println("方法内部 result = "+result);
        System.out.println("[日志] sub 方法结束了，结果是："+result);
        return result;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("[日志] mul 方法开始了，参数是："+a+","+b);
        int result=a*b;
        System.out.println("方法内部 result = "+result);
        System.out.println("[日志] mul 方法结束了，结果是："+result);
        return result;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("[日志] div 方法开始了，参数是："+a+","+b);
        int result=a/b;
        System.out.println("方法内部 result = "+result);
        System.out.println("[日志] div 方法结束了，结果是："+result);
        return result;
    }
}