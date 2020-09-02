package com.devCakeAB;

import java.util.ArrayList;

public class Main {

    static ArrayList<String> dynamicNames = new ArrayList<>();

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(498);
        numbers.add(120);

        int num1 = numbers.get(0);
        int num2 = numbers.get(2);

        System.out.println("For loop starting");
        for (int i = 0; i < numbers.size(); i++) {
            // System.out.println(array[i]);         // Array
            System.out.println(numbers.get(i));      // ArrayList
        }

        System.out.println("ForEach starting");
        for (int num: numbers) {
            System.out.println(num);
        }

        // Method addName(name) puts a max size of the arrayList. Created below
        addName("Bob");
        addName("Lisa");
        // dynamicNames.set(0, null);

        addName("Ross");


        // Print every element in arrayList


        // dynamicNames.add("Bob");
        // dynamicNames.add("Lisa");
        dynamicNames.add("Hej"); // Add new element
        dynamicNames.get(0); // Get element at index
        dynamicNames.set(1, "Då"); // Set element at index
        dynamicNames.size(); // Get length of arrayList
        dynamicNames.remove(1); // Remove at index
        // dynamicNames.trimToSize();

    }

    public static void addName(String name) {
        if (dynamicNames.size() < 1000) {
            dynamicNames.add(name);
        }
    }

}
