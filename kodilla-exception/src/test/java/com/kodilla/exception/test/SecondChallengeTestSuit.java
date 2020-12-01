package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReaderException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuit {

    @Test
    public void test()  {
        SecondChallenge secondChallenge = new SecondChallenge();
        assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5));
        assertDoesNotThrow(()-> secondChallenge.probablyIWillThrowException(1, 2));
        assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(0, 1.5));
    }
}
