package com.lwm.spring6.iocxml.auto.service;

import com.lwm.spring6.iocxml.auto.dao.UserDao;
import com.lwm.spring6.iocxml.auto.dao.UserDaoImp;
import com.lwm.spring6.iocxml.bean.UserDaoImpl;

/**
 * LWM
 * 2025/3/22 15:15
 **/
public class UserServiceImp implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {
        System.out.println("userService addUser");
        userDao.addUser();


        //UserDao userDao = new UserDaoImp();
        //userDao.addUser();

    }
}