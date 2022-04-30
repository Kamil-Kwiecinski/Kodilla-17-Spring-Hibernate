package com.kodilla.good.patterns.food;

import java.util.Map;

public interface Manufacturer {
    boolean process(Customer customer, Map<Product, Integer> orderList);
}
