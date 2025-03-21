package com.lwm.spring6.iocxml.bean;

/**
 * @Author LWM
 * @Date 2025/3/21 18:36
 **/
public class UserDaoImpl implements UserDao{

    @Override
    public void run() {
        System.out.println("UserDaoImpl.run()");
    }
}