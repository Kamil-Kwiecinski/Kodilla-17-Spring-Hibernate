package com.kodilla.exception.test;

public class Program {
    public static void main(String[] args) throws RouteNotFoundException {
        Flight flight = new Flight("Warsaw", "London");
        Flight flight2 = new Flight("Warsaw", "Moscow");
        SearchFlight flightMap = new SearchFlight();

        try {
            boolean isTrue = flightMap.searchFlight(flight.getArrivalAirport());
            System.out.println("Flight " + flight.getDepartureAirport() + " - " + flight.getArrivalAirport() + ": " + isTrue);
        } catch (RouteNotFoundException e) {
            System.out.println("Incorrect airport. Please correct!");
        }

        try {
            boolean isTrue = flightMap.searchFlight(flight2.getArrivalAirport());
            System.out.println("Flight " + flight2.getDepartureAirport() + " - " + flight2.getArrivalAirport() + ": " + isTrue);
        } catch (RouteNotFoundException e) {
            System.out.println("Incorrect airport. Please correct!");
        }
    }
}
