package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    public static void beforeAll(){
        logger = Logger.INSTANCE;
        logger.log("LAST ERROR");
    }

    @Test
    void testGetLastLog(){
        //given
        //when
        String lastLog = logger.getLastLog();
        //then
        assertEquals("LAST ERROR",lastLog);
    }

}
