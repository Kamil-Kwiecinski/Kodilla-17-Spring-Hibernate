package com.kodilla.spring.bikerent;

public class Bike {
    private String adds;
    private String type;
    private boolean isEngine;
    private double price;

    public Bike(String adds, String type, boolean isEngine, double price) {
        this.adds = adds;
        this.type = type;
        this.isEngine = isEngine;
        this.price = price;
    }

    public String getAdds() {
        return adds;
    }

    public void setAdds(String adds) {
        this.adds = adds;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEngine() {
        return isEngine;
    }

    public void setEngine(boolean engine) {
        isEngine = engine;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
