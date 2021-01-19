package com.kodilla.good.patterns.challenges.flightchallenge;

import java.util.HashMap;
import java.util.Map;

public class FlightRepo implements  FlightRepository{

    Map<String, String> flightRepositoryList = new HashMap<>();
    @Override
    public void createFlight(String departureAirport, String arrivalAirport) {
        flightRepositoryList.put(departureAirport, arrivalAirport);
    }
}
