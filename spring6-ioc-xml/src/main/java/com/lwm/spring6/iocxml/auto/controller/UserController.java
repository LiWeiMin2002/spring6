package com.lwm.spring6.iocxml.auto.controller;

import com.lwm.spring6.iocxml.auto.service.UserService;
import com.lwm.spring6.iocxml.auto.service.UserServiceImp;

/**
 * LWM
 * 2025/3/22 15:13
 **/
public class UserController {


    private UserService userService;


    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        System.out.println("userController addUser");

        userService.addUser();


        //UserService userService=new UserServiceImp();
        //userService.addUser();
    }

}