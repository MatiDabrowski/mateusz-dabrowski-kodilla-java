package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {

        try {
            if (x >= 2 || x < 1 || y == 1.5) {
                throw new Exception();
            }
        } catch (Exception o) {
            throw new ExceptionHandling();
        } finally {
            System.out.println("I will be here forever");
        }
        return "Done!";
    }
}
