package com.kodilla.good.patterns.food;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GlutenFreeShop implements Manufacturer{
    private Map<Product, Integer> productsInShop;

    public GlutenFreeShop() {
        productsInShop = createListOfProductsInShop();
    }

    private Map<Product, Integer> createListOfProductsInShop(){
        Map<Product, Integer> productsInShop = new HashMap<>();

        productsInShop.put(new WithoutGlutenProduct("No gluten bread", "Baking"), 15);
        productsInShop.put(new WithoutGlutenProduct("No gluten pasta", "Pasta"), 30);
        productsInShop.put(new WithoutGlutenProduct("No gluten flour", "Flour"), 20);


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
