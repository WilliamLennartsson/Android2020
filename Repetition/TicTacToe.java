package com.devCakeAB;

import java.util.Scanner;

public class TicTacToe {
    private int size = 3;
    private int[][] grid = new int[size][size];
    private Scanner sc = new Scanner(System.in);

//    {
//        {0, 0, 0},
//        {0, 0, 0},
//        {0, 0, 0}
//    }

    // Game loop
    public void start() {
        boolean isRunning = true;
        boolean isPlayerOne = true;
        System.out.println("TicTacToe");
        printBoard();
        while(isRunning) {
            System.out.println("Enter x and y");
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();
            play(x - 1, y - 1, isPlayerOne);
            isPlayerOne = !isPlayerOne;
            printBoard();
            checkWinner();
        }

    }

    // Check winner
    private void checkWinner(){
        int playerOneCounter = 0;
        int playerTwoCounter = 0;
        int playerOneVerticalCounter = 0;
        int playerTwoVerticalCounter = 0;
        int playerOneDiagonalCounter = 0;
        int playerTwoDiagonalCounter = 0;
        int playerOneDiagonalCounter2 = 0;
        int playerTwoDiagonalCounter2 = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            playerOneCounter = 0;
            playerTwoCounter = 0;
            playerOneVerticalCounter = 0;
            playerTwoVerticalCounter = 0;
            // Checks rows
            for (int j = 0; j < row.length; j++) {
                int value = row[j];
                if (value == 0) break;
                if (value == 1) playerOneCounter++;
                else playerTwoCounter++;
            }

            // Check columns
            for (int j = 0; j < grid.length; j++) {
                int value = grid[j][i];
                if (value == 0) break;
                if (value == 1) playerOneVerticalCounter++;
                else playerTwoVerticalCounter++;
            }

            // Check diagonals
            int value = grid[i][i];
            if (value == 1) playerOneDiagonalCounter++;
            else if(value == 2) playerTwoDiagonalCounter++;
            // y = (grid.length - 1) - x
            int x = i;
            int y = (grid.length - 1) - x;
            int diagonalValue = grid[x][y];
            if (diagonalValue == 1) playerOneDiagonalCounter2++;
            else if(diagonalValue == 2) playerTwoDiagonalCounter2++;

            if (playerOneCounter == size || playerOneVerticalCounter == size
            || playerOneDiagonalCounter == size || playerOneDiagonalCounter2 == size){
                System.out.println("Player 1 won");
                return;
            }
            if (playerTwoCounter == size || playerTwoVerticalCounter == size
                    || playerTwoDiagonalCounter == size || playerTwoDiagonalCounter2 == size){
                System.out.println("Player 2 won");
                return;
            }
        }
    }

    private int checkValue(int value, int counter) {
        if (value == 1 || value == 2) {
            return counter + 1;
        }
        return counter;
    }

    private void play(int x, int y, boolean isPlayerOne) {
        // TODO: Check valid userinput
        // TODO: Check if square is empty
        if (isPlayerOne) grid[y][x] = 1;
        else grid[y][x] = 2;
    }

    private void printBoard() {
        System.out.println("------------");
        System.out.println("    1    2    3");
        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            System.out.print(i + 1 + " ");
            for (int j = 0; j < row.length; j++) {
                System.out.print("{ " + row[j] + " }");
            }
            System.out.println();
        }
    }
}
