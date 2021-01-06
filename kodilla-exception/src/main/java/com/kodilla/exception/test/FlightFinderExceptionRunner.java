package com.kodilla.exception.test;

import java.util.Map;

public class FlightFinderExceptionRunner {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(new Flight("Wars", "Paris"));
        } catch (RouteNotFoundException o) {
            System.out.println("There is a problem: "  + o.getMessage());
        } finally {
            System.out.println("This is the end");
        }
    }
}
