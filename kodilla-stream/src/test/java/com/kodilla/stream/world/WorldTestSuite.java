package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
      //Given
      Country ec1 = new Country("EuropeanCountry1", new BigDecimal("1000000"));
      Country ec2 = new Country("EuropeanCountry2", new BigDecimal("2000000"));
      Country ec3 = new Country("EuropeanCountry3", new BigDecimal("3000000"));
      Country ec4 = new Country("EuropeanCountry4", new BigDecimal("4000000"));

      Country asc1 = new Country("AsianCountry1", new BigDecimal("10000000"));
      Country asc2 = new Country("AsianCountry2", new BigDecimal("20000000"));
      Country asc3 = new Country("AsianCountry3", new BigDecimal("30000000"));
      Country asc4 = new Country("AsianCountry4", new BigDecimal("40000000"));

      Country afc1 = new Country("AfricanCountry1", new BigDecimal("100000000"));
      Country afc2 = new Country("AfricanCountry2", new BigDecimal("200000000"));
      Country afc3 = new Country("AfricanCountry3", new BigDecimal("300000000"));
      Country afc4 = new Country("AfricanCountry4", new BigDecimal("400000000"));

      List<Country> euCountryList = new ArrayList<>();
      euCountryList.add(ec1);
      euCountryList.add(ec2);
      euCountryList.add(ec3);
      euCountryList.add(ec4);

      Continent europe = new Continent("Europe", euCountryList);

      List<Country> asCountryList = new ArrayList<>();
      asCountryList.add(asc1);
      asCountryList.add(asc2);
      asCountryList.add(asc3);
      asCountryList.add(asc4);

      Continent asia = new Continent("Asia", asCountryList);

      List<Country> afCountryList = new ArrayList<>();
      afCountryList.add(afc1);
      afCountryList.add(afc2);
      afCountryList.add(afc3);
      afCountryList.add(afc4);

      Continent africa = new Continent("Africa", afCountryList);

      List<Continent> continents = new ArrayList<>();
      continents.add(europe);
      continents.add(asia);
      continents.add(africa);

      World world = new World(continents);

      //When
      BigDecimal total = world.getPeopleQuantity();

      //Then
      Assert.assertEquals(new BigDecimal("1110000000"), total);
    }
}
