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
    String departureAirport;
    String arrivalAirport;
    String withTransfer;
    public Flight(String departureAirport, String arrivalAirport){
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }
    @Override
    public void findFlightFrom() {
        for (Airports airports: airportsList){
            if(departureAirport.equals(airports.toString())) {
                airportsFrom = airports.getArrivalAirport();
            }

        }
        System.out.println(airportsFrom);
    }

    @Override
    public void findFlightTo() {
        for (Airports airports: airportsList){
            if(arrivalAirport.equals(airports.toString())) {
                airportsTo = airports.getArrivalAirport();
            }

        }
        System.out.println(airportsTo);
    }

    @Override
    public void finfFlightWithTransfer() {
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

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
