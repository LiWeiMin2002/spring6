package com.lwm.spring6.resource;


import com.lwm.spring6.config.SpringConfig;
import com.lwm.spring6.resource.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * LWM
 * 2025/3/22 17:30
 **/
public class TestUserController {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController =  context.getBean("userController", UserController.class);
        userController.add();
    }
}