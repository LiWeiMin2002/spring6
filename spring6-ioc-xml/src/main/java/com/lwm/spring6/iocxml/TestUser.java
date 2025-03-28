package com.lwm.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  LWM
 *  2025/3/21 18:06
 **/
public class TestUser  {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //根据id获取bean
        User user1 =(User) context.getBean("user");
        System.out.println("1根据id获取bean：" + user1);


        //根据类型获取bean
        User user2 =(User)  context.getBean(User.class);
        System.out.println("2根据类型获取bean：" + user2);

        // 根据id和类型获取bean
        User user3 =(User)  context.getBean("user",User.class);
        System.out.println("3根据id和类型获取bean：" + user3);
    }
}