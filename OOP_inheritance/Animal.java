package com.devCakeAB;

/**
 * This class is an animal
 * @author williamlennartsson
 */
public class Animal {
    private String name;

    /**
     * Create an animal with a name
     * @param name
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Makes the animal eat something
     * @param food The type of food the animal eats
     */
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    /**
     *
     * @return Returns the name of the animal
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
