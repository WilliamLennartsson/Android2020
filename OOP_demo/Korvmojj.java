package com.devCakeAB;

public class Korvmojj {
    public int numberOfHotdogs;

    public void feedPerson(Person p) {
        if (numberOfHotdogs > 0) {
            // Det finns käk kvar
            if (p.isHungry) {
                numberOfHotdogs--;
                System.out.println(p.firstName + " goes nomnom");
                p.isHungry = false;
            }
        } else {
            System.out.println("Sorry. All out of korv");
        }
    }
}
