package com.lwm.spring6.iocxml.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LWM
 * @Date 2025/3/21 19:00
 **/
public class TestBook {

    @Test
    public void testSetter(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = (Book) context.getBean("book", Book.class);
        System.out.println(book);

      Book  bookCon=(Book)context.getBean("bookCon", Book.class);
      System.out.println(bookCon);
    }
}