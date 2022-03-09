package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void beforeEmpty() {
        System.out.println("Test with empty list: begin");
    }

    @DisplayName ("Testing when list is empty.")

    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        Integer list[]= new Integer[] {};
        List<Integer> emptyList = Arrays.asList(list);
        Integer expectedList = 0;

        //When
        Integer result = emptyList.size();

        //Then
        Assertions.assertEquals(result ,expectedList);
    }


    @AfterEach
    public void afterEmpty() {
        System.out.println("Test with empty list: end");
    }

    @BeforeEach
    public void beforeNormal() {
        System.out.println("Test with even and odd numbers: begin");
    }
    @DisplayName ("Testing when numbers are even and odd.")

    @Test
    void testOddNumbersExterminatorNormalList (){
        //Given
        Integer list[]= new Integer[] {1, 2, 3, 4, 5};
        List<Integer> normalList = Arrays.asList(list);

        Integer list2[]= new Integer[] {1, 2, 3, 4, 5};
        List<Integer> expectedList = Arrays.asList(list);
        //When
        for(int i = 0; i > normalList.size(); i++) {
            Integer result = normalList.get(i);
            Integer expectedResult = expectedList.get(i);
            //Then
            Assertions.assertEquals(result, expectedResult);
        }
    }

    @AfterEach
    public void afterNormal() {
        System.out.println("Test with even and odd numbers: end");
    }

}
