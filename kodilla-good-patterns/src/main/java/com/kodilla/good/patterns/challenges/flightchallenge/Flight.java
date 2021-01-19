package com.kodilla.good.patterns.challenges.flightchallenge;

import java.util.HashSet;
import java.util.Set;

public class Flight implements FindFlight {

    ConnectionsRetriever connectionsRetriever = new ConnectionsRetriever();
    Set<Airports> airportsList = connectionsRetriever.retrieve();
    Set<String> airportsDepartureList = new HashSet<>();
    Set<String> airportsArrivalList = new HashSet<>();
    String airportsFrom;
    String airportsTo;


    @Override
    public void findFlightFrom(String departureAirport) {
        for (Airports airports: airportsList){
            if(departureAirport.equals(airports.toString())) {
                airportsFrom = airports.getArrivalAirport();
            }

        }
        System.out.println(airportsFrom);
    }

    @Override
    public void findFlightTo(String arrivalAirport) {
        for (Airports airports: airportsList){
            if(arrivalAirport.equals(airports.toString())) {
                airportsTo = airports.getArrivalAirport();
            }

        }
        System.out.println(airportsTo);
    }

    @Override
    public void finfFlightWithTransfer(String departureAirport, String arrivalAirport) {
        for (Airports airports: airportsList){
            if(departureAirport.equals(airports.toString())) {
                airportsDepartureList = airports.getArrivalAirportList();
            }

        }
        for (Airports airports: airportsList){
            if(arrivalAirport.equals(airports.toString())) {
                airportsArrivalList = airports.getArrivalAirportList();
            }

        }
        for(String airportDeparture: airportsDepartureList){
            for(String airportArrival: airportsArrivalList){
                if (airportDeparture.contains(airportArrival) && airportArrival != arrivalAirport){
                    System.out.println("Lot z przesiadką: " + departureAirport + ", " + airportArrival+ ", " + arrivalAirport);
                }
            }
        }


    }


}
