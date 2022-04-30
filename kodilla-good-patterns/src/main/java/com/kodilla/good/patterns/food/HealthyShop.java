package com.kodilla.good.patterns.food;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HealthyShop implements Manufacturer{
    private Map<Product, Integer> productsInShop;

    public HealthyShop() {
        productsInShop = createListOfProductsInShop();
    }

    private Map<Product, Integer> createListOfProductsInShop(){
        Map<Product, Integer> productsInShop = new HashMap<>();

        productsInShop.put(new NaturalFruitProduct("Natural apples", "Fruits"), 25);
        productsInShop.put(new NaturalFruitProduct("Natural oranges", "Fruits"), 25);
        productsInShop.put(new NaturalVegetablesProduct("Natural carrot", "Vegetables"), 25);
        productsInShop.put(new NaturalVegetablesProduct("Natural lettuce", "Vegetables"), 25);

        return productsInShop;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> orderList) {
        for (Map.Entry<Product, Integer> entry : orderList.entrySet()) {
            Optional<Integer> numbersOfProducts = Optional.ofNullable(orderList.get(entry.getKey()));
            if (numbersOfProducts.orElse(0) < entry.getValue()) {
                System.out.println("Product is not into storage.");
                return false;
            }
        }
        return true;
    }
}
