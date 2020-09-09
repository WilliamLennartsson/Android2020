package com.devCakeAB;

public class Main {

    public static void main(String[] args) {
        Onix onix = new Onix();
        Gengar gengar = new Gengar();
        Pokemon wildPokemon = new Pokemon("Mew", 983, 3042);

        // sendToHospital(onix);
        // sendToHospital(gengar);

        // useAttack(onix);
        // useAttack(gengar);
        // useAttack(wildPokemon);

        Mac mac = new Mac();
        mac.printYourInventor();

        Windows windows = new Windows();
        windows.printYourInventor();
        // windows.harddrive;
        Computer c = new Windows();
        c.printYourInventor();

        Computer c2 = new Computer("Alan Turing");
        c2.printYourInventor();

        // Computer c = new Computer("Alan Turing");
        // c.printYourInventor();
        // c.getInventor();
        // Alan
        // Stevesteve


    }

    public static void useAttack(Pokemon p) {
        p.attack();
    }

    public static void sendToHospital(Pokemon p) {
        if (p instanceof Onix) {
            System.out.println("Onix sent to hospital");
        } else if (p instanceof Gengar) {
            System.out.println("Gengar sent to hospital");
        }
        p.getHealed();
    }

}
