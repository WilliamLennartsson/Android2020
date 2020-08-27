package com.devCakeAB;

import java.util.Scanner;

public class MainEm {
    public static void main(String[] args) {

        // Example value types vs reference types
        int a = 10;
        int b = a;
        b = 12;
        System.out.println(a); // What with be printed?

        int[] arrayA = {1, 2, 3};
        int[] arrayB = arrayA;
        arrayB[0] = 5;
        System.out.println(arrayA[0]);  // Same exact logic as before.
                                        // What will be printed?


        // Declare and initialize array with a size of 3
        String[] names = new String[3];
        // Put stuff in the boxes
        names[0] = "Will";
        names[1] = "Oleg";
        names[2] = "Alva";

        // Same result as above but creating and filling the array at the same time
        String[] names2 = {"Will", "Oleg", "Alva"};

        // Printing the array. But not really. Just the pointer
        System.out.println("Names: " + names);
        // In order to print every value you have to loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // .....
        // Add a new value after the array is created.
        // An array is immutable and cant increase in size
        // So how we solve this it to create a new array with a larger size
        // And copy all the values from the previous array into the new one
        String[] newNames = new String[4];
        for (int i = 0; i < names2.length; i++) {
            newNames[i] = names2[i];
        }
        // After copying there is one remaining slot to add our new value
        newNames[3] = "Kicki";

        // Calling our createArray method and saving the returned array
        // in a variable called intArray
        int[] intArray = createArray(5);
        // Next we're passing that array into our printArray method
        System.out.println("-- IntArray --");
        printArray(intArray);
        System.out.println("-- Doubled Array --");
        int[] doubledArray = doubleUpArray(intArray);
        printArray(doubledArray);
    }

    public static int[] createArray(int x) {
        // Create new array with a size based on x
        int[] array = new int[x];
        // Looping though the whole array
        for (int i = 0; i < array.length; i++) {
            // Filling the array with values
            // If i == 0 aka the first slot of our array.
            // We want the value 1
            // If i == 3 aka the fourth slot
            // We want the value 4.
            // The relationship between i and the value we want is i + 1
            array[i] = i + 1;
        }
        // When it's all done we can return the array
        return array;
    }

    // Method for printing an array
    public static void printArray(int[] array) {
        // array = [1, 2, 3, 4, 5]
        String sum = "[";
        // A better alternative to this is using a Stringbuilder
        // It's a special class for appending strings
        // StringBuilder sum = new StringBuilder("[");

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                // Using a StringBuilder we can append
                // sum.append(array[i]); // If using a StringBuilder
                // we can simply use the append method to add to our string
                sum += array[i];
            } else {
                // sum.append(array[i] + ", "); // If using a StringBuilder
                sum += array[i] + ", ";
            }
        }
        sum += "]"; // "[]" Closing off the brackets
        // sum.append("]"); // If using a StringBuilder
        System.out.println(sum);
        // If using a StringBuilder we need to use the .toString()
        // method to retrieve the actual string value
        // System.out.println(sum.toString());
    }


    // Method for taking an array and doubling its size.
    public static int[] doubleUpArray(int[] array) {
        // { 1, 2, 3, 4, 5 }
        // array.length == 5
        // doubledUpArray.length == array.length * 2 == 10
        int[] doubledUpArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            // Looping over array and copying every value to the new array
            doubledUpArray[i] = array[i];
        }
        // Returning the new array
        return doubledUpArray;
    }

}











