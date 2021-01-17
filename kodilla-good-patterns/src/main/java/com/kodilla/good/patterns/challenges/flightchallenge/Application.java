package com.kodilla.good.patterns.challenges.flightchallenge;

public class Application {
    public static void main(String[] args) {
       Flight flight1 = new Flight("Paryż", "Gdansk");
       flight1.findFlightFrom();
       flight1.findFlightTo();

       FlightRepo flightRepo = new FlightRepo();
       flightRepo.createFlight(flight1);

       flight1.finfFlightWithTransfer();


    }
}
