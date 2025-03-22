package com.lwm.spring6.iocxml.factoeybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * LWM
 * 2025/3/22 15:09
 **/
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-fanctorybean.xml");
        User user =  context.getBean("user", User.class);
        System.out.println(user);
    }
}