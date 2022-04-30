package com.kodilla.good.patterns.food;

public class NoSugarProduct extends Product {
    private String typeOfProduct;

    public NoSugarProduct(String name, String typeOfProduct) {
        super(name);
        this.typeOfProduct = typeOfProduct;
    }
}
