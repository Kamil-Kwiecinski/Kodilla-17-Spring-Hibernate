package com.kodilla.good.patterns.flights;

public class Flight {
    private String arrivalAirport;
    private String departureAirport;

    public Flight(String arrivalAirport, String departureAirport) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (arrivalAirport != null ? !arrivalAirport.equals(flight.arrivalAirport) : flight.arrivalAirport != null)
            return false;
        return departureAirport != null ? departureAirport.equals(flight.departureAirport) : flight.departureAirport == null;
    }

    @Override
    public int hashCode() {
        int result = arrivalAirport != null ? arrivalAirport.hashCode() : 0;
        result = 31 * result + (departureAirport != null ? departureAirport.hashCode() : 0);
        return result;
    }
}
