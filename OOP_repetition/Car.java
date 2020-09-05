package com.devCakeAB;

public class Car {
    private String model;
    private double marketValue;
    private double km;
    private static int counter = 237;
    private int regNumber;

    public Car(String model, double marketValue, double km) {
        this.model = model;
        this.marketValue = marketValue;
        this.km = km;
        counter++;
        this.regNumber = counter;
    }

    public void oneYearPassed() {
        this.marketValue *= 0.8;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", regNumber=" + regNumber +
                '}';
    }
}
