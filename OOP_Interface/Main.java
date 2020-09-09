package com.devCakeAB;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Bird> birdList = new ArrayList<>();
        Bird b1 = new Bird();
        Bird b2 = new Bird();
        birdList.add(b1);
        birdList.add(b2);

        for(Bird b: birdList) {
            System.out.println(b);
        }

                                            // -- Types --
        AirCraft airCraft = new AirCraft();  // AirCraft, Flying
        Boeing boeing = new Boeing();       // Boeing, AirCraft, Flying
        Bird bird = new Bird();             // Bird, Flying

        putPilotInAirCraft(boeing);

        prepareForTakeOff(airCraft);
        prepareForTakeOff(boeing);
        prepareForTakeOff(bird);
    }

    public static void prepareForTakeOff(Flying flyingObject) {
        flyingObject.fly();
    }

    public static void putPilotInAirCraft(AirCraft a) {
        a.fly();
    }

}
