package com.lwm.spring6.aop.example;

/**
 * LWM
 * 2025/3/24 13:12
 **/
public class TestCal {
    public static void main(String[] args) {
        //创建代理对象（动态）
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator calculator = (Calculator) proxyFactory.getProxy();
        calculator.add(1, 2);





        calculator.div(4, 2);



    }
}