package com.lwm.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

/**
 * LWM
 * 2025/3/22 19:14
 **/
@Repository
public class UserRedisDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("UserRedisDaoImpl add");
    }
}