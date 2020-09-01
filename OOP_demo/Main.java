package com.devCakeAB;

public class Main {

    public static void main(String[] args) {
        String[] colors = {"Red", "Pink", "Blue"};

        // Volvo
        Car car1 = new Car("Volvo", "2020 xc70");
        // car1.brand = "Volvo";
        // car1.model = "2020 xc70";
        car1.caross = "Kombi";
        car1.topSpeed = 230;
        car1.color = colors[0];

        car1.printDetails();

        Person p1 = new Person();
        p1.firstName = "Bosse";
        p1.age = 19;
        p1.isHungry = false;


        car1.drive();

        System.out.println(p1.firstName + " entered the car");
        car1.driver = p1;
        car1.drive();

    }















    /*public static void main(String[] args) {
        Animal a1 = new Animal("Dog", 12, 2014);
        // a1.name = "Dog";
        // a1.weight = 12;
        // a1.birthYear = 2014;

        Animal a2 = new Animal("Cat", 5, 2017);
        // a2.name = "Cat";
        // a2.weight = 5;
        // a2.birthYear = 2017;

        Animal a3 = new Animal("Sheep", 25, 2001);

        a1.printInfo();
        a2.printInfo();

        // Korvmojj
        Korvmojj mojj = new Korvmojj();
        mojj.numberOfHotdogs = 4;

        Person p1 = new Person();
        p1.firstName = "Will";
        p1.age = 51;
        p1.isHungry = true;

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












