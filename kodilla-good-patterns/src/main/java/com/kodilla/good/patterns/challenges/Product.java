package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;

public class Product {
    private String name;
    private String description;
    private BigDecimal price;

    public Product(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product:'" + name + '\'' +
                ", description:'" + description + '\'' +
                ", price: " + price;
    }
}
