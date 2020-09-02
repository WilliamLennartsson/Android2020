package com.devCakeAB;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String address;
    private ArrayList<String> courses;
    private int grade;
    private int studentID;
    public static int studentIDCount = 1000;

    public Student(String name, int age, String address, ArrayList<String> courses, int grade) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.courses = courses;
        this.grade = grade;
        studentIDCount++;
        studentID = studentIDCount;
        // this.studentID = studentID;
    }
    public Student(String name, int age) {
           this(name, age, "", null, 0);
    }
    public Student() {
        this("", 0, "", null, 0);
    }
    public String toString() {
        return studentID + ". " + name + ", " + age + " yrs";
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}









