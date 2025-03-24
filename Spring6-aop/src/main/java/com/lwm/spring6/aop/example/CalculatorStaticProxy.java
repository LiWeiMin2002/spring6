package com.lwm.spring6.aop.example;

/**
 * LWM
 * 2025/3/24 12:43
 **/
public class CalculatorStaticProxy implements Calculator {


    //把被代理的目标对象传递过来
    private Calculator calculator;

    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }


    @Override
    public int add(int a, int b) {
        System.out.println("[日志] add 方法开始了，参数是：" + a + "," + b);
        int addResult = calculator.add(a, b);
        System.out.println("[日志] add 方法结束了，结果是：" + addResult);
        return addResult;
    }

    @Override
    public int sub(int a, int b) {
        return 0;
    }

    @Override
    public int mul(int a, int b) {
        return 0;
    }

    @Override
    public int div(int a, int b) {
        return 0;
    }
}