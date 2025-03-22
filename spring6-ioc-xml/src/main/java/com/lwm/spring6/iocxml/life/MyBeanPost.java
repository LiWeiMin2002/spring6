package com.lwm.spring6.iocxml.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * LWM
 * 2025/3/22 14:55
 **/
public class MyBeanPost implements BeanPostProcessor {



    @Override
    public  Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before");
        return bean;
    }

    @Override
    public  Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After");
        return bean;
    }









}