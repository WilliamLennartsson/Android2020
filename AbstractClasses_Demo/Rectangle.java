package com.devCakeAB;

// Subclass to Shape
// Is of type Rectangle, Shape, ScalableArea & Object
public class Rectangle extends Shape implements ScalableArea {
    public Rectangle(double width, double height) {
        super(width, height);
    }

    // Implementation of abstract method in Shape class
    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }

    // Implementation of abstract method in ScalableArea interface
    @Override
    public double getScalableArea(double factor) {
        return (getWidth() * factor) * (getHeight() * factor);
    }
}
