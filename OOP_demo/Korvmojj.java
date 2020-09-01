package com.devCakeAB;

public class Korvmojj {
    public int numberOfHotdogs;

    // Klass method for Korvmojj. Takes a person as argument and feeds her
    // if numberOfHotdogs > 0 and the person is hungry.
    public void feedPerson(Person p) {
        // Check number of hotdogs
        if (numberOfHotdogs > 0) {
            // Det finns käk kvar
            // Check if the person is hungry
            if (p.isHungry) {
                numberOfHotdogs--; // Reduce number of hot-dogs
                System.out.println(p.firstName + " goes nomnom");
                p.isHungry = false; // Change isHungry to false
            }
        } else {
            System.out.println("Sorry. All out of korv");
        }
    }
}
