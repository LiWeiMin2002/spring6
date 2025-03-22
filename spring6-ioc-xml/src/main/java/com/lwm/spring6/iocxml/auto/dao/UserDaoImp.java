package com.lwm.spring6.iocxml.auto.dao;

/**
 * LWM
 * 2025/3/22 15:17
 **/
public class UserDaoImp implements UserDao {


    @Override
    public void addUser() {
        System.out.println("userDao addUser");
    }
}