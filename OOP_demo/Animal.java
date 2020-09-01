package com.devCakeAB;

public class Animal {
    public String name;
    public double weight;
    public int birthYear;

    public Animal(String name, double w, int b) {
        System.out.println("Animal Created");
        this.name = name;
        weight = w;
        birthYear = b;
    }

    public void printInfo() {
        System.out.println("Animal: " + name + ". Weight: " + weight + ". Birthyear: " + birthYear);
    }
}
