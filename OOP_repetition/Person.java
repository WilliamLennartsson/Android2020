package com.devCakeAB;

public class Person {
    // Personen ska ha ett namn, en
    // sysselsättning, en ålder, ett kön och en längd. V
    private String name;
    private String occupation;
    private int age;
    private String gender;
    private double heightCm;
    private House home;

    public Person(String name, String occupation, int age,
                  String gender, double heightCm, House home) {
        this.name = name;
        this.occupation = occupation;
        this.age = age;
        this.gender = gender;
        this.heightCm = heightCm;
        this.home = home;
    }

    public void oneYearPassed() {
        this.age += 1;
        // home.oneYearPassed();
    }

    public House getHome() {
        return home;
    }

    public void setHome(House home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", heightCm=" + heightCm +
                ", home=" + home +
                ", car=" + home.getCar() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

 /*   public void setAge(int age) {
        this.age = age;
    }

  */

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(double heightCm) {
        this.heightCm = heightCm;
    }
}
