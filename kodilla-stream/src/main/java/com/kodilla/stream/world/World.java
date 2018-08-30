package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continents;

    public World(final List<Continent> continents){
        this.continents = continents;
    }

    public List<Continent> getContinents() {
        return new ArrayList<>(continents);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal total = continents.stream()
                  .flatMap(continent -> continent.getCountries().stream())
                  .map(country -> country.getPeopleQuantity())
                  .reduce(BigDecimal.ZERO, (sum,countryQuantity) -> sum.add(countryQuantity));
        return total;
    }
}
