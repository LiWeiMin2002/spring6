package com.lwm.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  LWM
 *  2025/3/21 21:14
 **/
public class TestEmp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diarray.xml");
        Emp emp =  context.getBean("emp",Emp.class);
        System.out.println(emp);


    }
}