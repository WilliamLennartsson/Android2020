package com.devCakeAB;

public class Table {

    public static void printMultTable(int number, int range) {
        for (int i = 1; i <= range; i++) {
            System.out.println(number * i);
        }
    }
    public static void printMultTable(int number) {
        printMultTable(number, 10);
    }

    // 4. Write a method that prints a cube.
    // The method should receive the height and width.
    // Exprected output. input (5, 4):
    // *****
    // *---*
    // *---*
    // *****
    public static void cube2(int width, int height) {
        for (int i = 1; i <= height; i++) {
            System.out.println();
            for (int j = 1; j <= width; j++) {
                if (i == 1 || j == 1 || i == height || j == width) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
        }
    }

     public static void cube(int width, int height) {
        for (int i = 0; i < height; i++) {
            System.out.println();
            if (i == 0 || i == height - 1) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 2; j < width; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
            }
        }
    }

    public static void printFlag() {
        int width = 50;
        int evenRowWidth = width - 1;
        int oddRowWidth = width;
        int height = 12;
        int starWidth = 5;
        int starHeight = 4;

        for (int j = 0; j < height; j++) {
            System.out.println();
            if(j == 4) width +=5;
            for (int i = 0; i < width; i++) {
                if (i < starWidth && j < starHeight)  {
                    // Even rows
                    if (j % 2 == 0) {
                        starWidth = 4;
                        System.out.print(" *");
                        // Last star
                        if (i == starWidth - 1){
                            System.out.print("  ");
                            width = evenRowWidth;
                        }
                    } else { // Odd rows
                        starWidth = 5;
                        System.out.print("* ");
                        width = oddRowWidth;
                    }
                } else {
                    System.out.print("=");
                }
            }
        }
    }



}
