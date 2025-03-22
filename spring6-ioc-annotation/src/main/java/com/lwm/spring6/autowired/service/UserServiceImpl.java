package com.lwm.spring6.autowired.service;

import com.lwm.spring6.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * LWM
 * 2025/3/22 17:21
 **/
@Service
public class UserServiceImpl implements UserService {



    //    注入dao
    @Autowired
    @Qualifier(value = "userRedisDaoImpl")
    private UserDao userDao;


    @Override
    public void add() {
        System.out.println("service add");
        userDao.add();
    }
}
