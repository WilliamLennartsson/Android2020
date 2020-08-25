package com.devCakeAB;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        String str1 = "asdasd";
        str1.charAt(0);

        int number = 100;
        char letter = 'A';

        // Scanner sc = new Scanner(System.in);
        // sc.nextLine() // "123" "k" "%()!"("
        // sc.nextInt() // 123  hej

        int choice = 1; // choice 1 - 5
        // choice with if / if else
        if (choice == 1) {

        } else if(choice == 2) {

        } else if(choice == 3){

        } else {

        }
        // choice with switch
        switch (choice) {
            case 1 -> System.out.println("You chose 1");
            case 2 -> System.out.println("You chose 2");
            case 3 -> {
                System.out.println("You chose 3");
            }
            default -> System.out.println("None of the above");
        }

        // New feature of switch. Return values / yield
        String car = switch(choice) {
            case 1 -> {
                int a = 3 * 10;
                yield "Volvo" + a;
            }
            case 2 -> "Saab";
            default -> "No car";
        };
        System.out.println(car);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        // int number = sc.nextInt(); // -> 123
        sc.nextLine(); // Line to remove extra character that gets stuck after using sc.nextInt();

        System.out.println("Enter a string");
        String text = sc.nextLine(); // -> "123" + "123" = "123123"
        Integer.parseInt(text);      // -> "123" -> 123

        String name2;
        do {
            System.out.println("Enter your name. More than 3 letters");
            name2 = sc.nextLine();
        } while(name2.length() < 4);
        System.out.println("Your name " + name2 + " was accepted");


        while(true) {
            System.out.println("Enter your name. More than 3 letters");
            String name = sc.nextLine();
            if (name.length() < 3) {
                System.out.println("Name is too short");
            } else {
                System.out.println("Your name " + name + " was accepted");
                break;
            }
        }

        // Calling newly created method
        getInfoAndGreetPlayer();
        getInfoAndGreetPlayer();
        getInfoAndGreetPlayer();

        // Calling multTable method with different argument
        printMultiplicationTable(5); // 5, 10, 15, 20, 25, 30...
        printMultiplicationTable(100); // 100, 200, 300, 400, 500...
        System.out.println("Write a number");
        int table = sc.nextInt();
        printMultiplicationTable(table);

        // Calling calculateTax
        int tax = calculateTax(40000);

        // fibonacci(100);

        System.out.println(fibonacci2(10));

        // fibonacciUpTo(0, 1, 5000);
    }

    public static void fibonacciUpTo(int num1, int num2, int ceiling) {
        if (num2 >= ceiling) {
            return;
        }
        System.out.println(num1);
        fibonacciUpTo(num2, num1 + num2, ceiling);
    }

    public static int fibonacci(int n) {
        if (n <= 1){
            System.out.println(n);
        } else {
            System.out.println(n);
            fibonacci((n / 2) % n + n);
            // 0, 1, 1, 2, 3, 5, 8, 13, 21
        }
        return n;
    }

    public static int fibonacci2(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            int newNumber = fibonacci2(n-1) + fibonacci2(n-2);
            return newNumber;
        }
    }

    // Calculate expected tax
    public static int calculateTax(double amount) {
        double highIncomeTax = 0.4;
        double lowIncomeTax = 0.3;
        double taxToPay = 0;
        if (amount > 100000){
            taxToPay = amount * highIncomeTax;
        } else {
            taxToPay = amount * lowIncomeTax;
        }
        return (int)taxToPay;
    }

    // Receives a number and prints that multiplication table
    public static int printMultiplicationTable(int number) {
        int result = 0;
        for(int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.println(result);
        }
        return result;
    }

    // Collects info and greets user
    public static void getInfoAndGreetPlayer() {
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Hello " + name + ", " + age);
        sc.nextLine();
    }

}



