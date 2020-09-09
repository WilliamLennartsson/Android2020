package com.devCakeAB;

public class Gengar extends Pokemon {
    public Gengar() {
        super("Gengar", 145, 234);
    }

    @Override
    public void attack() {
        dreamEater();
    }

    public void dreamEater() {
        System.out.println("Wääeeehäeä");
    }
}
