package com.devCakeAB;

import java.util.ArrayList;

public class Employee {
    // firstName
    // lastName
    // age
    // workId
    // skills
    private String fullName;
    private int age;
    private final int workId;
    private static int workdIdCounter = 1;
    private ArrayList<String> skills = new ArrayList<>();

    // Constructor
    public Employee(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        // We don't need to pass an id in the constructor. It should be automatically generated
        this.workId = workdIdCounter;
        // Increment the static counter.
        workdIdCounter++;
        // Static == All instances share the same counter
    }
    
    @Override
    public String toString() {
        return "Employee id:" + workId + ". " + fullName;
    }

    public int getWorkId() {
        return workId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}
