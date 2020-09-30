package com.devCakeAB;

public class Main {

    // 1.
    // A program to keep track of books.
    // Let a user add a new books
    // Let a user list all books
    // Let a user remove books
    // Let a user search for a book
    // Let a user update a book

    // 2.
    // public void table(int n) -> 2, 4, 6, 8,
    // A method to print a multiplication table.
    // Should be able to accept one input and output all integers that are alignted with that table up to 10
    // or two inputs, in which it should output all numbers up to the given second parameter.

    // 3.
    // Write a Java program to print an American flag on the screen. Go to the editor
    //Expected Output

    //* * * * * * ==================================
    // * * * * *  ==================================
    //* * * * * * ==================================
    // * * * * *  ==================================
    //* * * * * * ==================================
    // * * * * *  ==================================
    //* * * * * * ==================================
    // * * * * *  ==================================
    //* * * * * * ==================================
    //==============================================
    //==============================================
    //==============================================
    //==============================================
    //==============================================
    //==============================================

    // 4. Write a method that prints a cube.
    // The method should receive the height and width.
    // Exprected output. input (5, 4):
    // *****
    // *---*
    // *---*
    // *****

    // 5.
    // A method to reverse a string

    // 5.
    // A method to check if the input if even or not
    // Should return a boolean


    // 6.
//    Skriv en klass “SecureScanner”.
//    Klassen ska ha tillgång till en scanner.
//    Klassen ska även ha metoder för att hämta en int från användaren. Metoden ska även använda sig utav felhantering. Om användaren skriver in en felaktig sträng ska “Wrong input” printas ut och användaren ska få skriva in ett nytt värde. Detta ska loopa tills det att värdet är korrekt formaterat.
//
//    SecureScanner sc = new SecureScanner();
//    System.out.println(“Enter a number”);
//    int number = sc.nextInt();
//    System.out.println(“Number: “ + number);
//
//    Exempel output:
//
//    Enter a number
//            hejhej
//    Wrong input
//    aijwdasd
//    Wrong input
//    153
//    Number: 153

    // Write a Java program to merge two given sorted array of integers
    // and create a new sorted array.

    public static void main(String[] args) {
        // Table.printMultTable(10, 20);
        // Table.printMultTable(8);
//        Table.cube(8, 4);
//        Table.cube(3, 3);
//        Table.cube2(5, 3);
        // Table.printFlag();
        TicTacToe game = new TicTacToe();
        game.start();
    }

}
