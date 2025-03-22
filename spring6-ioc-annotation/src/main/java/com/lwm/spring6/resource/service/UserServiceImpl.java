package com.lwm.spring6.resource.service;


import com.lwm.spring6.resource.dao.UserDao;
import com.lwm.spring6.resource.dao.UserRedisDaoImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * LWM
 * 2025/3/22 17:21
 **/
@Service("myUserService")
public class UserServiceImpl implements UserService {
    @Resource(name = "myUserRedisDaoImpl")
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("UserServiceImpl......");
        userDao.add();
    }
}
