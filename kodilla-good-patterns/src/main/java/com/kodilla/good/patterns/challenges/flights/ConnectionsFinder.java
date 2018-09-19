package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConnectionsFinder {

    List<Flight> flights;

    public ConnectionsFinder(List<Flight> flights){
        this.flights = flights;
    }

    public List<Flight> from(String departure){
        return flights.stream()
               .filter(f -> f.getDeparture().equals(departure))
               .collect(Collectors.toList());
    }

    public List<Flight> to(String arrival){
        return flights.stream()
                .filter(f -> f.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }


    public List<List<Flight>> indirectFromTo(String departure, String arrival){
        List<Flight> allFlightsTo = to(arrival);
        List<List<Flight>> result = new ArrayList<>();

        List<Flight> allFlightsFrom = allFlightsTo
                      .stream()
                      .flatMap(f -> to(f.getDeparture()).stream())
                      .filter(f -> (f.getDeparture() == departure))
                      .collect(Collectors.toList());


        for (Flight fl: allFlightsFrom){
            List<Flight> connection = new ArrayList<>();
            connection.add(fl);
            connection.add(new Flight(fl.getArrival(), arrival));
            result.add(connection);
        }

        return result;
    }


}
