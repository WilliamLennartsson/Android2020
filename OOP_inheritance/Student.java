package com.devCakeAB;

public class Student extends Person {

    private double csnPerMonth;

    public Student(String name, int age, double csnPerMonth) {
        super(name, age); // Calls Person constructor
        this.csnPerMonth = csnPerMonth;
    }

    public void attendClass() {
        System.out.println(getName() + " is here!");
    }

}
