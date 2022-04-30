package com.kodilla.good.patterns.food;

import java.util.List;

public class OrderService {
    public void collectAllOrders(List<OrderRequest> orderRequestList) {
        orderRequestList.stream()
                .map(i -> {
                    System.out.println("Your order is collecting " + i.getCustomer().getName());
                    return i.getManufacturer().process(i.getCustomer(), i.getOrderList());

                })
                .forEach(n -> System.out.println("You ordered: " + n + "\n"));
    }
}
