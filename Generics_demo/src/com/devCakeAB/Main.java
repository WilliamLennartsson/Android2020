package com.devCakeAB;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create a box that holds a value of type String
        Box<String> box = new Box<>();
        // Set the value of the variable in box
        // It can now only be of type String
        box.setT("hej");

        // Create a box that holds a value of type Scanner
        Box<Scanner> scannerBox = new Box<>();
        // Now we can only set the value to be a scanner
        scannerBox.setT(new Scanner(System.in));
        // scannerBox.setT("Hej"); // Error
        System.out.println(box.getT());

        // ---- Pair ----
        // Here we specify what types we want for our object.
        // In this case String & Integer.
        // Remember, no primitive types.
        // So instead of int we choose Integer (wrapper to make a primitive type a reference type)
        Pair<String, Integer> p1 = new Pair<>("Hej", 5);
        // After specifying the types, getFirst now returns a String
        // getSecond returns an Integer
        System.out.println("P1 first: " + p1.getFirst() + ". Second: " + p1.getSecond());

        // Create a second Pair. Now with types Double & Integer
        Pair<Double, Integer> p2 = new Pair<>(1.35, 120);
        System.out.println("P2 first: " + p2.getFirst() + ". Second: " + p2.getSecond());
    }

}
