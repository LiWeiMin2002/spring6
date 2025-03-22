package com.lwm.spring6.autowired;

import com.lwm.spring6.autowired.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * LWM
 * 2025/3/22 17:30
 **/
public class TestUserController {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController =  context.getBean("userController", UserController.class);
        userController.add();
    }
}