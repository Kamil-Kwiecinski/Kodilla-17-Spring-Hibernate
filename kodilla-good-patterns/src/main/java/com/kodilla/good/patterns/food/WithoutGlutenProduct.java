package com.kodilla.good.patterns.food;

public class WithoutGlutenProduct extends Product{
    private String typeOfProduct;

    public WithoutGlutenProduct(String name, String typeOfProduct) {
        super(name);
        this.typeOfProduct = typeOfProduct;
    }
}
