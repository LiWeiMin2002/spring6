package com.lwm.spring6.iocxml.life;

/**
 * LWM
 * 2025/3/22 14:11
 **/
public class User {
    private String name;

    public User() {
        System.out.println("无参构造");
    }

    //初始化
    public void initMethod() {
        System.out.println("初始化");
    }

    //销毁
    public void destroyMethod() {
        System.out.println("销毁");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set name");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }


}