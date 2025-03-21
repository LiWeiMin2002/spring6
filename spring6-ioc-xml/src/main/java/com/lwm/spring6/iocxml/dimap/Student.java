package com.lwm.spring6.iocxml.dimap;

import java.util.List;
import java.util.Map;

/**
 * @Author LWM
 * @Date 2025/3/21 21:58
 **/
public class Student {
    private List<Lesson> lessonList;
    private Map<String,Teacher> studentMap;
    private String studentId;
    private String studentName;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Map<String, Teacher> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<String, Teacher> studentMap) {
        this.studentMap = studentMap;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonsList) {
        this.lessonList = lessonsList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lessonsList=" + lessonList +
                ", studentMap=" + studentMap +
                ", studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}