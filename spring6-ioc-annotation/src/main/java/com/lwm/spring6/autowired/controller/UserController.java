package com.lwm.spring6.autowired.controller;

import com.lwm.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * LWM
 * 2025/3/22 17:19
 **/
@Component
public class UserController {

    //注入service
    //1.属性注入
    //@Autowired
    //private UserService userService;

    //2.set方法注入
    //private UserService userService;
    //
    //@Autowired
    //public void setUserService(UserService userService) {
    //    this.userService = userService;
    //}


    //构造方法上注入
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }



    public void add() {
    System.out.println("controller add");
    userService.add();
}
}