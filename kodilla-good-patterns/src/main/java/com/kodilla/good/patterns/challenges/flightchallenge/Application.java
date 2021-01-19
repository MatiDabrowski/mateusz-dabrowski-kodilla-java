package com.kodilla.good.patterns.challenges.flightchallenge;

public class Application {
    public static void main(String[] args) {
       Flight flight1 = new Flight( );
       flight1.findFlightFrom("Warszawa");
       flight1.findFlightTo("Gdansk");

       FlightRepo flightRepo = new FlightRepo();
       flightRepo.createFlight("Warszawa", "Paris");

       flight1.finfFlightWithTransfer("Warszawa", "Gdansk");


    }
}
