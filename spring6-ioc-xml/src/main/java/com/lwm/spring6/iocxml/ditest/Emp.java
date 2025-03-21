package com.lwm.spring6.iocxml.ditest;

import java.util.Arrays;

/**
 * 员工
 *
 * @Author LWM
 * @Date 2025/3/21 20:55
 **/
public class Emp {

    //员工属于某一个部门
    private Dept dept;

    private String eName;
    private Integer age;
    private String[] loves;

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }


    @Override
    public String toString() {
        return
                dept +
                        ", " + eName +
                        "正在工作......" + age +
                        ", 爱好：" + Arrays.toString(loves);
    }
}