package com.lwm.spring6.iocxml.dimap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  LWM
 *  2025/3/21 22:12
 **/
public class TeacherStudent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
        Student student =  context.getBean("studentp",Student.class);
        System.out.println(student);
    }
}