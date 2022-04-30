package com.kodilla.good.patterns.food;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements Manufacturer{
    private Map<Product, Integer> productsInShop;

    public ExtraFoodShop() {
        productsInShop = createListOfProductsInShop();
    }

    private Map<Product, Integer> createListOfProductsInShop(){
        Map<Product, Integer> productsInShop = new HashMap<>();

        productsInShop.put(new NoSugarProduct("No sugar vanilla cookies", "Sweets"), 50);
        productsInShop.put(new NoSugarProduct("No sugar banana joghurt", "Dairy"), 50);
        productsInShop.put(new NoSugarProduct("No sugar strawberries jam", "Preserves"), 10);
        productsInShop.put(new WithoutGlutenProduct("No gluten pasta", "Pasta"), 20);


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
