package com.devCakeAB;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // ArrayList for our shapes
        ArrayList<Shape> shapes = new ArrayList<>();

        // Create different kind of shapes
	    Square square1 = new Square(10);
        Square square2 = new Square(4.5);
	    Rectangle rect1 = new Rectangle(1.7, 3.8);
        Rectangle rect2 = new Rectangle(5, 3);
	    Triangle triangle1 = new Triangle(5, 5);
        Triangle triangle2 = new Triangle(13, 3);

        // Add shapes to list
        shapes.add(square1);
        shapes.add(square2);
        shapes.add(rect1);
        shapes.add(rect2);
        shapes.add(triangle1);
        shapes.add(triangle2);
        // shapes.add(new Triangle(13, 3));

        // Factor for scaling
        double scaleFactor = 2;

        // Loop through all shapes
        for (Shape s : shapes) {
            // Print the unscaled area of shape
            System.out.println("Unscaled area: " + s.getArea());

            // Check if Shape s is of type ScalableArea
            // Does s implement the interface ScalableArea?
            if (s instanceof ScalableArea) {
                // if so. Typecast s to a type of ScalableArea and store it in a variable scalableShape
                // getScalableArea(factor) only exists on the type ScalableArea, not shapes
                ScalableArea scalableShape = (ScalableArea)s;
                // Call the getScalableArea on the scalableShape object and store the result in a variable (scaledArea)
                double scaledArea = scalableShape.getScalableArea(scaleFactor);
                // Print result
                System.out.println("Scaled area: " + scaledArea);
            }
        }
//        System.out.println("Square area: " + square1.getArea());
//        System.out.println("Rectangle area: " + rect1.getArea());
//        System.out.println("Triangle area: " + triangle1.getArea());
    }

}
