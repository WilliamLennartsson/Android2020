package com.devCakeAB;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Math - Helt statisk
        // Math.pow(5, 2); -> 25

        Random r = new Random();
        System.out.println("Random double: " + r.nextDouble());
        System.out.println("Random int: " + r.nextInt());
        System.out.println("Random int with bound: " + r.nextInt(10) + 1);
        System.out.println("Random bool: " + r.nextBoolean());

        String s = "Hejhej";
        System.out.println("Substring: " + s.substring(2));
        System.out.println("Substring2: " + s.substring(2, 4));

        System.out.println("Replace: " + s.replace('e', 'B')); // HBjhBj
        System.out.println("Replace string: " + s.replace("hej", "då")); // Hejdå

        /*
        Lion l = new Lion("Simba");
        Hyena h = new Hyena("Larsa");

        l.roar();
        h.laugh();

        l.eat("Apples");
        h.eat("Bananas");
         */


        /*Student s = new Student("Will", 18, 500);
        s.attendClass();

        Teacher t = new Teacher("Bob", 45, 5000);

        System.out.println("Student name: " + s.getName());
        System.out.println("Teacher name: " + t.getName());

         */


        // Person p = new Person("asd", 18);
        // p.attendClass();
    }

}
