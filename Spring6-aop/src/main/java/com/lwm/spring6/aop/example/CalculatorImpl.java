package com.lwm.spring6.aop.example;

/**
 * LWM
 * 2025/3/24 11:37
 **/
public class CalculatorImpl implements Calculator {

    @Override
    public int add(int a, int b) {
        int result=a+b;
        System.out.println("方法内部 result = "+result);
        return result;
    }

    @Override
    public int sub(int a, int b) {
        int result=a-b;
        System.out.println("方法内部 result = "+result);
        return result;
    }

    @Override
    public int mul(int a, int b) {
        int result=a*b;
        System.out.println("方法内部 result = "+result);
        return result;
    }

    @Override
    public int div(int a, int b) {
        int result=a/b;
        System.out.println("方法内部 result = "+result);
        return result;
    }
}