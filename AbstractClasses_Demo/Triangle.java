package com.devCakeAB;

// Subclass to Shape
// Is of type Triangle, Shape, ScalableArea & Object
public class Triangle extends Shape implements ScalableArea {
    public Triangle(double width, double height) {
        super(width, height);
    }

    // Implementation of abstract method in Shape class
    @Override
    public double getArea() {
        return (getWidth() * getHeight()) / 2;
    }

    // Implementation of abstract method in ScalableArea interface
    @Override
    public double getScalableArea(double factor) {
        // return getArea() * factor;
        return ((getWidth() * factor) * (getHeight() * factor)) / 2;
    }
}
