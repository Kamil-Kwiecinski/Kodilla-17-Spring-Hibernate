package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void testPizzaOrderDecorator() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new Pepperoni(pizzaOrder);
        pizzaOrder = new ExtraCheese(pizzaOrder);
        pizzaOrder = new Mushrooms(pizzaOrder);

        //When
        BigDecimal totalCost = pizzaOrder.getCost();
        String ingredientsList = pizzaOrder.getIngredients();
        String expectedList = "Tomato souce + cheese + pepperoni + extra cheese + mushrooms";

        //Then
        assertEquals(new BigDecimal("35"), totalCost);
        assertEquals(expectedList, ingredientsList);
        System.out.println("Pizza ingredients : " + ingredientsList + "\n" + "Pizza cost : " + totalCost);
    }
}
