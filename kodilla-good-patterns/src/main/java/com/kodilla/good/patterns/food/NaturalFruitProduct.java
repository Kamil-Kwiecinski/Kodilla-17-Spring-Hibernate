package com.kodilla.good.patterns.food;

public class NaturalFruitProduct extends Product{
    private String typeOfProduct;

    public NaturalFruitProduct(String name, String typeOfProduct) {
        super(name);
        this.typeOfProduct = typeOfProduct;
    }
}
