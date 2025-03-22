package com.lwm.spring6.iocxml.bean;

/**
 *  LWM
 *  2025/3/21 18:45
 **/
public class PersonDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("PersonDaoImpl.run()");
    }
}