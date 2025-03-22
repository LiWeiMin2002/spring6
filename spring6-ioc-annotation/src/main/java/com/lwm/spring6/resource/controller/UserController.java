package com.lwm.spring6.resource.controller;


import com.lwm.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * LWM
 * 2025/3/22 17:19
 **/
@Component("userController")
public class UserController {
    @Resource(name = "myUserService")
    private UserService userService;


    public void add() {
        System.out.println("controller......");
        userService.add();
    }
}