package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> countries;
    private final String name;

    public Continent(final String name, final List<Country> countries){
        this.countries = countries;
        this.name = name;
    }

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }

    public String getName() {
        return name;
    }
}
