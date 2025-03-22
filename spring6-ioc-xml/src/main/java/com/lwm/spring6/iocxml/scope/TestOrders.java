package com.lwm.spring6.iocxml.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * LWM
 * 2025/3/22 14:01
 **/
public class TestOrders {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders1 = context.getBean("orders", Orders.class);
        System.out.println(orders1);

        Orders orders2 = context.getBean("orders", Orders.class);
        System.out.println(orders2);
    }
}