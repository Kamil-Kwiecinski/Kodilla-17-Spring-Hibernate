package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private int sideOne;
    private int sideTwo;
    private int high;
    private final static String name = "Triangle";

    public Triangle(int sideOne, int sideTwo, int high) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.high = high;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return (sideOne * high)/2;
    }
}
