package com.devCakeAB;

public class Onix extends Pokemon{
    private boolean isImmortal = true;

    public Onix() {
        super("Onix", 78, 125);
    }

    public void attack() {
        stoneRoll();
    }

    public void stoneRoll() {
        System.out.println("Like a rolling stone");
    }
}
