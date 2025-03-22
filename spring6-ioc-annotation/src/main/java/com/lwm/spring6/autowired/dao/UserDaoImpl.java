package com.lwm.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

/**
 * LWM
 * 2025/3/22 17:21
 **/
@Repository
public class UserDaoImpl implements UserDao {


    @Override
    public void add() {
        System.out.println("dao add");
    }
}