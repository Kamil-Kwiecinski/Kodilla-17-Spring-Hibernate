package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Pepperoni extends AbstractPizzaDecorator{

    public Pepperoni(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("5"));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + pepperoni";
    }
}
