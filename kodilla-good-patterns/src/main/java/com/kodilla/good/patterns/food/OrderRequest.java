package com.kodilla.good.patterns.food;

import java.util.Map;

public class OrderRequest {
    private Customer customer;
    private Manufacturer manufacturer;
    private Map<Product, Integer> orderList;

    public OrderRequest(Customer customer, Manufacturer manufacturer, Map<Product, Integer> orderList) {
        this.customer = customer;
        this.manufacturer = manufacturer;
        this.orderList = orderList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Map<Product, Integer> getOrderList() {
        return orderList;
    }
}
