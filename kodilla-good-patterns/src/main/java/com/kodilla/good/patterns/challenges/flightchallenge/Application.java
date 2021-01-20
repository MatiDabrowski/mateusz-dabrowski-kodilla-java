package com.kodilla.good.patterns.challenges.flightchallenge;

public class Application {
    public static void main(String[] args) {
        Flight flight1 = new Flight( );
        String flightFrom = flight1.findFlightFrom("Warszawa");
        String flightTo = flight1.findFlightTo("Gdansk");

        FlightRepo flightRepo = new FlightRepo();
        flightRepo.createFlight("Warszawa", "Paris");

        String flightWithTransfer = flight1.finfFlightWithTransfer("Warszawa", "Gdansk");

        System.out.println(flightFrom);
        System.out.println(flightTo);
        System.out.println(flightWithTransfer);
    }
}
