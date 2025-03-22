package com.lwm.spring6.iocxml.auto;

import com.lwm.spring6.iocxml.auto.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * LWM
 * 2025/3/22 15:32
 **/
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-auto.xml");
        UserController userController =context.getBean("userController", UserController.class);
        userController.addUser();
    }
}