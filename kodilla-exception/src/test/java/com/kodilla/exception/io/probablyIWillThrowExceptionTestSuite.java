package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class probablyIWillThrowExceptionTestSuite {

    @Test
    void testProbablyIWillThrowException (){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                ()-> assertThrows(Exception.class, ()->secondChallenge.probablyIWillThrowException(2.0,1.4)),
                ()-> assertThrows(Exception.class, ()->secondChallenge.probablyIWillThrowException(1.0,1.5))
        );

    }
}
