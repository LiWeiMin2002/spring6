package com.lwm;


import com.lwm.bean.AnnotationApplicationContext;
import com.lwm.bean.ApplicationContext;
import com.lwm.dao.UserDao;
import com.lwm.service.UserService;

/**
 * LWM
 * 2025/3/24 02:32
 **/
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationApplicationContext("com.lwm");
        //UserDao userDao=(UserDao) context.getBean(UserDao.class);
        //System.out.println(userDao);
        //userDao.add();
        UserService userService=(UserService) context.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }
}