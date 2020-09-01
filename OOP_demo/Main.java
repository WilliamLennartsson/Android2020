package com.devCakeAB;

public class Main {

    // Car example
    public static void main(String[] args) {
        String[] colors = {"Red", "Pink", "Blue"};

        // Volvo
        // Create new car
        Car car1 = new Car("Volvo", "2020 xc70");
        // car1.brand = "Volvo";
        // car1.model = "2020 xc70";
        car1.caross = "Kombi";
        car1.topSpeed = 230;
        car1.color = colors[0];
        // Call printDetails method on the car1 object
        car1.printDetails();
        // Create an instance of a person
        Person p1 = new Person();
        // Assign values to properties. Name, age etc..
        p1.firstName = "Bosse";
        p1.age = 19;
        p1.isHungry = false;

        // Call the drive method on car1.
        car1.drive(); // Will it work?

        // Add a driver to the car
        car1.driver = p1;
        System.out.println(p1.firstName + " entered the car");
        car1.drive();

    }

    // Animal / Korvmojj example
    /*public static void main(String[] args) {
        // Create a new animal. Passing "Dog", 12 & 2014 as arguments to the constructor
        Animal a1 = new Animal("Dog", 12, 2014);
        // a1.name = "Dog";
        // a1.weight = 12;
        // a1.birthYear = 2014;

        Animal a2 = new Animal("Cat", 5, 2017);
        // a2.name = "Cat";
        // a2.weight = 5;
        // a2.birthYear = 2017;

        Animal a3 = new Animal("Sheep", 25, 2001);
        // Calling the printInfo method on a1 and a2
        a1.printInfo();
        a2.printInfo();

        // Korvmojj
        // Create a korvmojj (hot-dog stand)
        Korvmojj mojj = new Korvmojj();
        // Set number of hotdogs available
        mojj.numberOfHotdogs = 4;

        // Create a person
        Person p1 = new Person();
        p1.firstName = "Will";
        p1.age = 51;
        p1.isHungry = true;
        // Call feedPerson method on mojj. Pass a person as argument
        mojj.feedPerson(p1);
        System.out.println("Hotdogs remaining: " + mojj.numberOfHotdogs);
        System.out.println(p1.firstName + " is hungry? " + p1.isHungry);

        p1.isHungry = true;
        mojj.feedPerson(p1);
        p1.isHungry = true;
        mojj.feedPerson(p1);
        p1.isHungry = true;
        mojj.feedPerson(p1);
        p1.isHungry = true;
        mojj.feedPerson(p1);

    }
    */
}












