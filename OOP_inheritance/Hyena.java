package com.devCakeAB;

public class Hyena extends Animal {

    public Hyena(String name) {
        super(name);
    }

    public void laugh() {
        System.out.println(getName() + ": Hahah!");
    }
}
