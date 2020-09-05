package com.devCakeAB;

public class House {
    private double surface;
    private int floors;
    private double marketValue;
    private int buildYear;
    private String address;
    private Car car;

    public House(double surface, int floors, double marketValue, int buildYear, String address) {
        this.surface = surface;
        this.floors = floors;
        this.marketValue = marketValue;
        this.buildYear = buildYear;
        this.address = address;
    }

    public void oneYearPassed() {
        this.marketValue *= 1.05;
        // car.oneYearPassed();
    }

    // public String printInfo() {}
    public String toString() {
        return  address;
        //+ ". Surface:" + surface + ". Floors:" + floors + ". Market Value: " + marketValue + ". Build Year: " + buildYear;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}



