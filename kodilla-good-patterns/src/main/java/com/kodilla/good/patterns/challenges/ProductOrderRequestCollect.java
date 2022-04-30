package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductOrderRequestCollect {

    public ProductOrderRequest collect(){
        User user = new User("AndNow71", "Andrzej", "Nowak");
        Product product = new Ball("Volleyball ball", "Amazing ball for volleyball!",
                new BigDecimal(200));
        int numberOfProducts = 2;
        LocalDateTime orderDate = LocalDateTime.of(2022, 4, 30, 10, 50);

        System.out.println("Collect order is starting:");
        System.out.println("Time: " + orderDate + "\nUser: " + user.getUserName() + "; " + product +
                "; Number of products: " + numberOfProducts) ;

        return new ProductOrderRequest(user, product, numberOfProducts, orderDate);
    }
}
