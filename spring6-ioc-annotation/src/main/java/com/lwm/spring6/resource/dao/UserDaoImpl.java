package com.lwm.spring6.resource.dao;


import org.springframework.stereotype.Repository;

/**
 * LWM
 * 2025/3/22 17:21
 **/
@Repository("myUserDaoImpl")
public class UserDaoImpl implements UserDao {


    @Override
    public void add() {
        System.out.println("UserDaoImpl......");
    }
}