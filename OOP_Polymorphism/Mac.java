package com.devCakeAB;

public class Mac extends Computer{
    public Mac() {
        super("Steve & steve");
    }

    @Override
    public void printYourInventor() {
        // Computer c = new Computer(getInventor());
        super.printYourInventor();
        System.out.println("Mac inventor is " + getInventor());
    }
}
