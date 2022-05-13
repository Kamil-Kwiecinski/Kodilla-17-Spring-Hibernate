package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {

    @Test
    void testBigMacBuilder() {
        //Given
        BigMac bigMac = new BigMac.BigMacBulider()
                .Bun(Bun.NOSEASAM)
                .Sauce(Sauce.BARBACUE)
                .Ingredients(Ingredient.BACON)
                .Ingredients(Ingredient.CHEESE)
                .Ingredients(Ingredient.CUCUMBER)
                .Ingredients(Ingredient.CHILLI)
                .Burgers(2)
                .build();

        //When
        String bun = bigMac.getBun().getBunType();
        String sauce = bigMac.getSauce().getSauce();
        int burgers = bigMac.getBurgers();
        List<String> ingredients = bigMac.getIngridients();
        System.out.println(bigMac);

        //Then
        assertEquals("NO SEASAM", bun);
        assertEquals("BARBACUE", sauce);
        assertEquals(2, burgers);
        assertEquals(4, ingredients.size());
    }
}
