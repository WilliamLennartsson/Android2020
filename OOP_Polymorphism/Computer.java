package com.devCakeAB;

public class Computer {
    private String inventor;

    public Computer(String inventor) {
        this.inventor = inventor;
    }

    public void printYourInventor() {
        System.out.println("Computer inventor is Alan Turing");
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}
