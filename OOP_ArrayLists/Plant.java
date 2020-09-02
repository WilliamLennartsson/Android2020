package com.devCakeAB;

public class Plant {
    private String name;
    private String variety;
    private String color;
    private double height;

    // Constructor
    public Plant(String name, String variety, double height, String color) {
        this.name = name;
        this.variety = variety;
        this.height = height;
        this.color = color;
    }

    // Getter
    public String getName() {
        return name;
    }
    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
