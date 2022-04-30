package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderDTO {
    private User user;
    private Product product;
    private int numberOfProducts;
    private LocalDateTime date;
    private boolean isSold;

    public ProductOrderDTO(User user, Product product, int numberOfProducts, LocalDateTime date, boolean isSold) {
        this.user = user;
        this.product = product;
        this.numberOfProducts = numberOfProducts;
        this.date = date;
        this.isSold = isSold;
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

    public boolean isSold() {
        return isSold;
    }
}
