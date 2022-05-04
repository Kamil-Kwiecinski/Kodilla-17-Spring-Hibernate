package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearcher {
    private Airports airports;

    public FlightSearcher(Airports airports) {
        this.airports = airports;
    }

    public Set<Flight> flightsTo(String arrivalAirport) {
        return airports.getPossibleFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> flightsFrom(String departureAirport) {
        return airports.getPossibleFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());
    }

    public Set<List<Flight>> transferFlights(String departureAirport, String arrivalAirport) {
        Set<List<Flight>> flightSet = new HashSet<>();
        List <Flight> transferList = new ArrayList<>();

        transferList = airports.getPossibleFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());

        transferList = airports.getPossibleFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        transferList = airports.getPossibleFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(flight.getDepartureAirport()))
                .collect(Collectors.toList());

        List<Flight> travelList = new ArrayList<>();
        List<Flight> flightList = airports.getPossibleFlights().stream()
                        .collect(Collectors.toList());

        travelList.addAll(flightList);
        flightSet.add(transferList);

        return flightSet;
    }
}
