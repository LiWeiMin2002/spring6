package com.lwm.spring6.resource.dao;


import org.springframework.stereotype.Repository;

/**
 * LWM
 * 2025/3/22 19:14
 **/
@Repository("myUserRedisDaoImpl")
public class UserRedisDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("UserRedisDaoImpl......");
    }
}