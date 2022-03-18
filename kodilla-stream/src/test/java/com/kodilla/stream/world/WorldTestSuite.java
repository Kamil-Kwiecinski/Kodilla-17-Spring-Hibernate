package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){

        //Given
        BigDecimal polandQuantity = new BigDecimal("1234567");
        BigDecimal germanyQuantity = new BigDecimal("1234567");
        BigDecimal boliviaQuantity = new BigDecimal("123456");
        BigDecimal brasilQuantity = new BigDecimal("123456789");
        BigDecimal chinaQuantity = new BigDecimal("1234568790");
        BigDecimal indiaQuantity = new BigDecimal("1234567890");

        Country country1 = new Country("Poland", polandQuantity);
        Country country2 = new Country("Germany", germanyQuantity);
        Country country3 = new Country("Bolivia", boliviaQuantity);
        Country country4 = new Country("Brasil", brasilQuantity);
        Country country5 = new Country("China", chinaQuantity );
        Country country6 = new Country("India", indiaQuantity);

        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent southAmerica = new Continent("South America");

        //When
        asia.addCountry(country5);
        asia.addCountry(country6);
        europe.addCountry(country1);
        europe.addCountry(country2);
        southAmerica.addCountry(country3);
        southAmerica.addCountry(country4);

        World world = new World();
        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(southAmerica);
        BigDecimal result = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleNumber = new BigDecimal("2595186059");
        assertEquals(expectedPeopleNumber, result);
    }
}
