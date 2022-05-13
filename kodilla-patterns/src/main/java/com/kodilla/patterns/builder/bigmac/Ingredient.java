package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.List;

public class Ingredient {

    public static final String SALAT = "SALAT";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String CHILLI = "CHILLI";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String PRAWNS = "PRAWNS";
    public static final String CHEESE = "CHEESE";
    public static final String[] ingredients = {SALAT, ONION, BACON, CUCUMBER,
            CHILLI, MUSHROOMS, PRAWNS, CHEESE};
    private static final List<String> ingredientsList = Arrays.asList(ingredients);

    public static boolean correctIngredient(String ingredient) {
        return ingredientsList.contains(ingredient);
    }
}
