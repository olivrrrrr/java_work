package com.olivertech;

public class Garage {
    // private properties
    private String size;
    private Car[] cars;
    private String color;
    private boolean isAManCave;

    public Garage(String size, Car[] cars, String color, boolean isAManCave) {
        this.size = size;
        this.cars = cars;
        this.color = color;
        this.isAManCave = isAManCave;
    }

    public String getSize() {
        return size;
    }

    public Car[] getCars() {
        return cars;
    }

    public String getColor() {
        return color;
    }

    public boolean isAManCave() {
        return isAManCave;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAManCave(boolean AManCave) {
        isAManCave = AManCave;
    }
}
