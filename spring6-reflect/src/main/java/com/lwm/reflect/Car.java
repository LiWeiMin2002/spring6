package com.lwm.reflect;

/**
 * LWM
 * 2025/3/23 13:10
 **/
public class Car {
    private String name;

    private int age;

    private String color;

    public Car() {
    }

    public Car(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }


    //普通方法（私有的）
    private void run() {
        System.out.println("私有方法+run......");
    }


}