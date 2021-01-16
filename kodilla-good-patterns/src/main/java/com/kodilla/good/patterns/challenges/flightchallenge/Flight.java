package com.kodilla.good.patterns.challenges.flightchallenge;

import java.util.HashSet;
import java.util.Set;

public class Flight implements FindFlight {
    ConnectionsRetriever connectionsRetriever = new ConnectionsRetriever();
    Set<Airports> airportsList = connectionsRetriever.retrieve();
    String airportsFrom;
    String airportsTo;
    @Override
    public void findFlightFrom(String departureAirport) {
        for (Airports airports: airportsList){
            if(departureAirport.equals(airports.toString())) {
                airportsFrom = airports.getAllArrivalAirport();
            }

        }
        System.out.println(airportsFrom);
    }

    @Override
    public void findFlightTo(String arrivalAirport) {
        for (Airports airports: airportsList){
            if(arrivalAirport.equals(airports)) {
                airports.getAllArrivalAirport();
            }

        }

    }
}
