package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //do nothing

        //Then
        double addResult = calculator.add(5, 5);
        double subResult = calculator.sub(10, 2);
        double mulResult = calculator.mul(4, 3);
        double divResult = calculator.div(14, 7);

        //When
        Assertions.assertEquals(10, addResult);
        Assertions.assertEquals(8, subResult);
        Assertions.assertEquals(12, mulResult);
        Assertions.assertEquals(2, divResult);

    }
}
