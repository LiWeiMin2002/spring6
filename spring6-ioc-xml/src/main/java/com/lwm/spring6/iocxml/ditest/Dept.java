package com.lwm.spring6.iocxml.ditest;

import java.util.List;

/**
 * 部门
 *  LWM
 *  2025/3/21 20:54
 **/
public class Dept {
    private String dName;

    private List<Emp> empList;

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "部门名称：" + dName+'\t'+ empList.toString();
    }


}