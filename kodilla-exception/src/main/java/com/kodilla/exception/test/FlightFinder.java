package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportsMap = new HashMap<>();
        airportsMap.put("Warsaw", true);
        airportsMap.put("Posnan", false);
        airportsMap.put("Bydgoszcz", true);
        airportsMap.put("Paris", false);
        airportsMap.put("Berlin", true);
        airportsMap.put("Tokyo", false);

        if (!airportsMap.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Arrival port doesnt exist");
        }
        if (!airportsMap.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("Departure port doesnt exist");
        }
    }
}
