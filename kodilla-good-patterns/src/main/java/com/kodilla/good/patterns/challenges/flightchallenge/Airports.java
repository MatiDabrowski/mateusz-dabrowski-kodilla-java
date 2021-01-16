package com.kodilla.good.patterns.challenges.flightchallenge;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Airports {
    private final String airport;
    private final Set<Airports> arrivalAirportList = new HashSet<>();

    public Airports(String airport) {
        this.airport = airport;
    }

    public String getAirport() {
        return airport;
    }

    public void addArrivalAirport(Airports arrivalAirport){
        arrivalAirportList.add(arrivalAirport);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airports airports = (Airports) o;

        return airport != null ? airport.equals(airports.airport) : airports.airport == null;
    }

    @Override
    public int hashCode() {
        return airport != null ? airport.hashCode() : 0;
    }

    @Override
    public String toString() {
        return airport;
    }

    public Set<String> getArrivalAirport(){
        return arrivalAirportList.stream()
                .map(Airports::getAirport)
                .collect(Collectors.toSet());
    }

    public String getAllArrivalAirport(){
        return arrivalAirportList.stream()
                .flatMap(airport -> airport.getArrivalAirport().stream())
                .filter(airport -> airport != this.toString())
                .map(Airports::getAirport)
                .collect(Collectors.joining(","));
    }




}
