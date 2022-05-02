package com.kodilla.good.patterns.flights;

import java.util.Set;

public class Airports {
    private Set<Flight> possibleFlights;

    public Airports(Set<Flight> possibleFlights) {
        this.possibleFlights = possibleFlights;
    }

    public Set<Flight> getPossibleFlights() {
        return possibleFlights;
    }
}
