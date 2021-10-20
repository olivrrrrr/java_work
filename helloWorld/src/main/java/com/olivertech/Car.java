package com.olivertech;

public class Car {
    private String make;
    private String model;
    private int cost;

    public Car(String make, String model, int cost) {
        this.make = make;
        this.model = model;
        this.cost = cost;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
