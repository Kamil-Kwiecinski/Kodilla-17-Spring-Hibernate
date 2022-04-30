package com.kodilla.good.patterns.food;

public class NaturalVegetablesProduct extends Product{
    private String typeOfProduct;

    public NaturalVegetablesProduct(String name, String typeOfProduct) {
        super(name);
        this.typeOfProduct = typeOfProduct;
    }
}
