package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRequest {

    private User user;
    private Product product;
    private int numberOfProducts;
    private LocalDateTime date;

    public ProductOrderRequest(User user, Product product, int numberOfProducts, LocalDateTime date) {
        this.user = user;
        this.product = product;
        this.numberOfProducts = numberOfProducts;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
