package com.kodilla.good.patterns.challenges.flights;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa","Kraków"));
        flights.add(new Flight("Kraków","Poznań"));
        flights.add(new Flight("Poznań","Gdańsk"));
        flights.add(new Flight("Gdańsk","Kielce"));
        flights.add(new Flight("Warszawa","Kielce"));
        flights.add(new Flight("Warszawa","Gdańsk"));
        flights.add(new Flight("Gdańsk","Poznań"));
        flights.add(new Flight("Kraków","Kielce"));

        ConnectionsFinder cf = new ConnectionsFinder(flights);

        String from = "Warszawa";
        System.out.println("Odlatujące z " + from + ":");
        cf.from(from).stream().forEach(f -> System.out.println(f));

        String toa = "Poznań";
        System.out.println("\nPrzylatujące do " + toa + ":");
        cf.to(toa).stream().forEach(f -> System.out.println(f));

        System.out.println("\nWszystkie pośrednie połączenia z " + from + " do " + toa);
        cf.indirectFromTo(from, toa).stream().forEach(l -> System.out.println(l));


    }
}
