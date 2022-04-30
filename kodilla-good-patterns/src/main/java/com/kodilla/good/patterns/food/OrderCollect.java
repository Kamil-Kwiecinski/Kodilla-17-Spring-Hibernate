package com.kodilla.good.patterns.food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderCollect {

    public List<OrderRequest> collect() {

        List<OrderRequest> orderRequestList = new ArrayList<>();
        Customer customer1 = new Customer("NoSugarGirl");
        Manufacturer manufacturer1 = new ExtraFoodShop();
        Map<Product, Integer> orderList1 = new HashMap<>();
        orderList1.put(new NoSugarProduct("No sugar strawberries jam", "Preserves"), 1);
        orderList1.put(new NoSugarProduct("No sugar vanilla cookies", "Sweets"), 1);

        orderRequestList.add(new OrderRequest(customer1, manufacturer1, orderList1));

        Customer customer2 = new Customer("NoSugarGirl");
        Manufacturer manufacturer2 = new HealthyShop();
        Map<Product, Integer> orderList2 = new HashMap<>();
        orderList2.put(new NaturalFruitProduct("Natural apples", "Fruits"), 5);
        orderList2.put(new NaturalFruitProduct("Natural carror", "Vegetables"), 7);

        orderRequestList.add(new OrderRequest(customer2, manufacturer2, orderList2));

        return orderRequestList;
    }
}
