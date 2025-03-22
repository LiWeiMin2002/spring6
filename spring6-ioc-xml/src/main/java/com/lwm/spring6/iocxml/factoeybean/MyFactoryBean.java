package com.lwm.spring6.iocxml.factoeybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * LWM
 * 2025/3/22 15:05
 **/
public class MyFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}