package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightManager {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("London",false);
        flights.put("Warsaw",true);
        flights.put("New York",true);
        flights.put("Chicago",true);
        flights.put("Madrid",true);
        flights.put("Barcelona",false);
        flights.put("Rome",false);
        flights.put("Hamburg",true);
        flights.put("Moscow",true);

        if (flights.get(flight.getDepartureAirport()) == null ||
                flights.get(flight.getArrivalAirport()) == null){
            throw new RouteNotFoundException("Non-existing airport");
        }

        if (flights.get(flight.getDepartureAirport())
                    && flights.get(flight.getArrivalAirport())) {
                System.out.println("Connection is possible");
                return true;

        } else
            return false;
    }

    public static void main(String[] args) {

        FlightManager fm = new FlightManager();

        Flight moscow_to_berlin = new Flight("Moscow","Berlin");

        boolean flightExists = false;

        try {
            flightExists = fm.findFlight(moscow_to_berlin);
        } catch (RouteNotFoundException e) {
            System.out.println("Problem with flight: " + e.getMessage());
        } finally {
            System.out.println("Connection was checked:");
            if (flightExists){
                System.out.println("It exists.");
            } else {
                System.out.println("It does not exists.");
            }
        }
    }
}
