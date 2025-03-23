package com.lwm.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * LWM
 * 2025/3/23 13:13
 **/
public class TestCar {
    @Test
    public void test01() throws Exception {
        Class clazz1 = Car.class;

        Class clazz2 = new Car().getClass();

        Class clazz3 = Class.forName("com.lwm.reflect.Car");


        Car car = (Car) clazz3.getDeclaredConstructor().newInstance();
        System.out.println(car);


    }


    @Test
    public void test02() throws Exception {
        Class clazz = Car.class;
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + " " + constructor.getParameterCount());
        }
        Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class, String.class);
        constructor.setAccessible(true);

        Car car = (Car) constructor.newInstance("夏利", 6, "红色");
        System.out.println(car);


    }


    @Test
    public void test03() throws Exception {
        Class clazz = Car.class;
        Car car = (Car) clazz.getDeclaredConstructor().newInstance();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {

            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(car, "五菱宏光");

            }


            System.out.println(field.getName() + " " + field.getType());
            System.out.println(car);
        }
    }


    @Test
    public void test04() throws Exception {
        Car car = new Car("奔驰", 10, "黑色");
        Class clazz = car.getClass();


        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            if (method.getName().equals("run")) {
                method.setAccessible(true);
                String invoke = (String) method.invoke(car);
                System.out.println(invoke);
            }
        }


    }


}