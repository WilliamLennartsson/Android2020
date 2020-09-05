package com.devCakeAB;

public class Main {
    public static void main(String[] args) {

        House house1 = new House(100, 2, 10000, 2001, "Backen 1");
        House house2 = new House(350, 3, 25000, 2009, "Kullen 3");
        // System.out.println(house1);

        Person person1 = new Person("Billybob Braskyn", "Attornet law", 35, "M", 180.5, house1);
        Person person2 = new Person("Atlal Basha", "Hacker", 35, "M", 189.5, house2);

        Car car1 = new Car("V45", 800, 2000000);
        Car car2 = new Car("BMW 118D", 1200, 13098);

        house1.setCar(car1);
        house2.setCar(car2);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println("House1 market value: " + house1.getMarketValue());
        System.out.println("House2 market value: " + house2.getMarketValue());
        System.out.println("------------");

        // person1.oneYearPassed();
        // person2.oneYearPassed();
        int yearsToPass = 20;
        passTime(yearsToPass, person1);
        passTime(yearsToPass, person2);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println("House1 market value: " + house1.getMarketValue());
        System.out.println("House2 market value: " + house2.getMarketValue());
    }

    public static void passTime(int years, Person p) {
        for (int i = 0; i < years; i++) {
            newYear(p);
        }
    }

    public static void newYear(Person p) {
        // p == Person
        // p.getHome() == House
        // p.getHome().getCar() == Car

        p.oneYearPassed(); // person.oneYearPassed
        p.getHome().oneYearPassed(); // house.oneYearPassed
        p.getHome().getCar().oneYearPassed(); // car.oneYearPassed

        // House house = p.getHome();
        // house.setMarketValue(house.getMarketValue() * 1.1);
    }
}
