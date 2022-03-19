package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite implements ArrayOperations{

    @Test
    void testGetAverage(){
        //Given
        int array[] = {1, 3, 5, 7, 9, 11, 13, 15};
        double expectedResult = 8.0;

        //When
        double result = ArrayOperations.getAverage(array);

        //Then
        assertEquals(expectedResult, result);

    }
}
