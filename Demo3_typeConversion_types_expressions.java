package com.devCakeAB;

public class Main {

    public static void main(String[] args) {

        // Type conversions

        double myDouble = 100;
        // Double to int
        int myNumber = (int)myDouble;
        String stringNumber = "183";
        // String to int
        int parsedInt = Integer.parseInt(stringNumber);
        // String to float
        float parsedFloat = Float.parseFloat(stringNumber);
        // String to double
        double parsedDouble = Double.parseDouble(stringNumber);
        // Double to string
        String doubleString = "Value: " + myDouble;
        // Int to string
        String intString = String.valueOf(myNumber);

        // Testing stringToInt
        System.out.println("153 - " + stringToInt("153"));
        System.out.println("1200 - " + stringToInt("1200"));
        System.out.println("-12 - " + stringToInt("-12"));
    }

    public static int stringToInt(String s) {
        boolean isNegative = false;
        if (s.isEmpty()) return 0; // No need to continue. String is empty
        if (s.charAt(0) == '-') { // Check if its a negative number
            s = s.substring(1); // Remove the minus sign
            isNegative = true; // Will use this later to reverse the result
        }
        int base = '0'; // a char converted to an int produces an int. '0' == 48
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // Get each character in the string
            sum = (sum * 10) + (c-base);
        }
        if (isNegative) sum *= -1; // Reversing a positive sum to a negative
        return sum;
    }


    // And - returns true if a AND b are both true
    public static boolean and(boolean a, boolean b) {
        return a && b;
        /*if (a && b){
            return true;
        } else {
            return false;
        }*/
    }

    // Or - Returns true if either a or b is true
    public static boolean or(boolean a, boolean b) {
        return a || b;
    }

    // Xor - Returns true if one and only one is true
    public static boolean xor(boolean a, boolean b) {
        if ((a && !b) || (!a && b))  {
            return true;
        }
        return false;
        // return (a && !b) || (!a && b);
    }

    // Not - returns false if true and vice versa
    public static boolean not(boolean a) {
        if (!a){
            return true;
        }
        return false;
        // return !a;
    }































/*
    public static boolean and(boolean a, boolean b) {
        if (a && b) return true;
        return false;
        // return a && b;
    }

    public static boolean or(boolean a, boolean b) {
        if (a || b) return true;
        return false;
        // return a || b;
    }

    System.out.println(xor(false, true));
    System.out.println(xor(false, false));
    System.out.println(xor(true, false));
    System.out.println(xor(true, true));
    public static boolean xor(boolean a, boolean b) {
        return a == not(b);
    }

    public static boolean not(boolean a) {
        return !a;
    }
    */



}
