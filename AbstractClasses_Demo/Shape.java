package com.devCakeAB;

// Abstract class.
// Can't be instantiated. Used as a base class for more concrete shapes.
public abstract class Shape {
    // All shapes should have a width and a height
    private double width;
    private double height;

    // Constructor for width and height
    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Abstract method. Needs to be implemented in the normal classes the extends this class
    public abstract double getArea();

    // Getters.
    // Note. No setters and no way to change the values of width or height == immutable
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

}
