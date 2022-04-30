package com.kodilla.good.patterns.food;

public class Food2Door {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.collectAllOrders(new OrderCollect().collect());
    }
}
