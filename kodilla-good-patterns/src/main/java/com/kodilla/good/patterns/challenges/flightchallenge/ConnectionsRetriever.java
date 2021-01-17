package com.kodilla.good.patterns.challenges.flightchallenge;

import java.util.HashSet;
import java.util.Set;

public class ConnectionsRetriever {
    private Set<Airports> airportsList = new HashSet<>();
    public Set<Airports> retrieve(){
        Airports warszawa = new Airports("Warszawa");
        Airports paris = new Airports("Paryż");
        Airports gdansk = new Airports("Gdansk");
        Airports tokio = new Airports("Tokio");

        warszawa.addArrivalAirport(paris);
        warszawa.addArrivalAirport(gdansk);

        paris.addArrivalAirport(warszawa);
        paris.addArrivalAirport(gdansk);
        paris.addArrivalAirport(tokio);

        gdansk.addArrivalAirport(warszawa);
        gdansk.addArrivalAirport(paris);
        gdansk.addArrivalAirport(tokio);

        tokio.addArrivalAirport(paris);
        tokio.addArrivalAirport(gdansk);


        airportsList.add(warszawa);
        airportsList.add(tokio);
        airportsList.add(gdansk);
        airportsList.add(paris);

        return new HashSet<>(airportsList);
    }
}
