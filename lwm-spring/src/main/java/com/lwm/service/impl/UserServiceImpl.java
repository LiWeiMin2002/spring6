package com.lwm.service.impl;

import com.lwm.anno.Bean;
import com.lwm.anno.Di;
import com.lwm.dao.UserDao;
import com.lwm.service.UserService;

/**
 * LWM
 * 2025/3/23 17:49
 **/
@Bean
public class UserServiceImpl implements UserService {
    @Di
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service add");
        userDao.add();
    }
}