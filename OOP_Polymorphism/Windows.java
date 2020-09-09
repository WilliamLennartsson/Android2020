package com.devCakeAB;

public class Windows extends Computer{
    public String harddrive = "Rätt kass";
    public Windows() {
        super("Bill Gates");
    }

    @Override
    public void printYourInventor() {
        super.printYourInventor();
        System.out.println("Windows inventor is " + getInventor());
    }
}
