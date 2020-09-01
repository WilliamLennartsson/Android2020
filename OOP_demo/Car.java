package com.devCakeAB;

public class Car {
    public String brand;
    public double topSpeed;
    public String caross;
    public String model;
    public String color;
    public Person driver;

    // Constructor. Takes to arguments. A string for brand and a string for model
    public Car(String b, String m) {
        // Save the passed arguments in the instance variables
        brand = b;
        model = m;
        System.out.println(b + " created. Model: " + m);
    }

    // Method for printing details about the car
    public void printDetails() {
        System.out.println("Brand: " + brand + ". TopSpeed: " + topSpeed + " Model: " + model + ". " +
                "Color: " + color + ". Caross: " + caross);
    }

    public void drive() {
        if (driver != null) {
            if (driver.age >= 18) {
                System.out.println("Drove into the distance");
            } else {
                System.out.println(driver.firstName + " is too young to drive");
            }
        } else {
            System.out.println("No driver..");
        }
    }
}
