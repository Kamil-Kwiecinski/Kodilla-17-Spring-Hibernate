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

            airports.getPossibleFlights().stream()
                    .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                    .forEach(flight -> {
                        List<Flight> n = airports.getPossibleFlights().stream()
                                .filter(i -> flight.getArrivalAirport().equals(i.getDepartureAirport())
                                        && i.getArrivalAirport().equals(arrivalAirport))
                                .collect(Collectors.toList());

                        if (n.size() > 0) {
                            List<Flight> travelList = new ArrayList<>();
                            travelList.add(flight);
                            travelList.addAll(n);
                            flightSet.add(travelList);
                        }
                    });


        return flightSet;
    }
}
