package com.lwm.dao.impl;

import com.lwm.anno.Bean;
import com.lwm.dao.UserDao;

/**
 * LWM
 * 2025/3/23 17:50
 **/
@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add");
    }
}