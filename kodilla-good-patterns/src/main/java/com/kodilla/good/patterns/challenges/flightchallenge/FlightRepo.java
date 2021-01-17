package com.kodilla.good.patterns.challenges.flightchallenge;

import java.util.HashMap;
import java.util.Map;

public class FlightRepo implements  FlightRepository{

    Map<String, String> flightRepositoryList = new HashMap<>();
    @Override
    public void createFlight(Flight flight) {
        flightRepositoryList.put(flight.getDepartureAirport(), flight.getDepartureAirport());
    }
}
