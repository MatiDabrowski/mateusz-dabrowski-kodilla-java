package com.kodilla.good.patterns.challenges.flightchallenge;

public interface FindFlight {
    String findFlightFrom(String departureAirport);
    String findFlightTo(String arrivalAirport);
    String finfFlightWithTransfer(String departureAirport, String arrivalAirport);
}
