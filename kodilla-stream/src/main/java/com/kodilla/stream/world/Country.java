package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final BigDecimal peopleQuantity;
    private final String name;

    public Country(final String name, final BigDecimal peopleQuantity){
        this.peopleQuantity = peopleQuantity;
        this.name = name;
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }

    public String getName() {
        return name;
    }
}
