package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void getLastLog() {
        //Given
        Logger logger = Logger.INSTANCE;

        //When
        logger.log("text");
        String result = logger.getLastLog();

        //Then
        assertEquals("text", result);
    }
}
