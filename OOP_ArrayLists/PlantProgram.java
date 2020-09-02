package com.devCakeAB;

import java.util.ArrayList;
import java.util.Scanner;

public class PlantProgram {

    static ArrayList<Plant> plantList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Plant plant1 = new Plant("Tomato", "Romantica", 1.5, "Red");
        Plant plant2 = new Plant("Gurka", "Jungelgurka", 2, "Color");
        Plant plant3 = new Plant("Vindruva", "Sover Jan Blund", 5.4, "Gul");

        plantList.add(plant1);
        plantList.add(plant2);
        plantList.add(plant3);
        // --------------------
        // plantList.add(new Plant("Tomato", "Romantica", 1.5, "Red"));
        // plantList.add(new Plant("Gurka", "Jungelgurka", 2, "Color"));
        // plantList.add(new Plant("Vindruva", "Sover Jan Blund", 5.4, "Gul"));

        printAllPlantNames();

        addPlantToList();

        printAllPlantNames();
    }

    // Lets user add a plant to the list
    public static void addPlantToList() {
        System.out.println("Enter plant name: ");
        String plantName = sc.nextLine();
        System.out.println("Enter plant variety: ");
        String plantVariety = sc.nextLine();
        System.out.println("Enter plant height");
        double plantHeight = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter plant color: ");
        String plantColor = sc.nextLine();

        Plant plant = new Plant(plantName, plantVariety, plantHeight, plantColor);
        plantList.add(plant);
    }

    public static void printAllPlantNames() {
        // For each plant in plantList
        for (Plant plant: plantList) {
            System.out.println(plant.getName());
        }
        /*for (int i = 0; i < plantList.size(); i++) {
            // Plant p = plantList[i];
            Plant p = plantList.get(i);
        }*/
    }
}










