package com.devCakeAB;

// Subclass to Shape
// Is of type Square, Shape, & Object
public class Square extends Shape{
    public Square(double sideLen) {
        super(sideLen, sideLen);
    }

    // Implementation of abstract method in Shape class
    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }
}
