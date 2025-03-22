package com.lwm.spring6.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  LWM
 *  2025/3/21 18:39
 **/
public class TestUserDao {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        UserDao userDao = context.getBean("userDao",UserDao.class);
        System.out.println(userDao);
        userDao.run();


        UserDao personDao = context.getBean("personDao",UserDao.class);
        System.out.println(personDao);
        personDao.run();
    }
}