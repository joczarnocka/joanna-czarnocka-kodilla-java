package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaGetCost() {
        // Given
        Pizza thePizza = new BasicPizza();
        // When
        BigDecimal calculatedCost = thePizza.getCost();
        System.out.println("Cena pizzy: " + calculatedCost);
        // Then
        assertEquals(new BigDecimal(15.0), calculatedCost);
    }


    @Test
    public void testBasicPizzaGetDescription() {
        // Given
        Pizza thePizza = new BasicPizza();
        // When
        String description = thePizza.getDescription();
        System.out.println("Opis pizzy: " + description);
        // Then
        assertEquals("Pizza (ciasto i sos pomidorowy z serem)",description);
    }


    @Test
    public void testPizzaOlivesOnionGetCost()
    {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza =  new OlivesDecorator(thePizza);
        thePizza =  new OnionDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        System.out.println("Cena pizzy: " + theCost);
        //Then
        assertEquals(new BigDecimal(19), theCost);
    }

    @Test
    public void testPizzaOlivesOnionGetDescription()
    {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza =  new OlivesDecorator(thePizza);
        thePizza =  new OnionDecorator(thePizza);
        //When
        String description= thePizza.getDescription();
        System.out.println("Opis pizzy: " + description);
        //Then
        assertEquals("Pizza (ciasto i sos pomidorowy z serem) + olives + onion", description);
    }

    @Test
    public void testPizzaHamMushrumsOnionGetCost()
    {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza =  new HamDecorator(thePizza);
        thePizza =  new MushrumsDecorator(thePizza);
        thePizza =  new OnionDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        System.out.println("Cena pizzy: " + theCost);
        //Then
        assertEquals(new BigDecimal(26), theCost);
    }

    @Test
    public void testPizzaHamMushrumsOnionGetDescription()
    {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza =  new HamDecorator(thePizza);
        thePizza =  new MushrumsDecorator(thePizza);
        thePizza =  new OnionDecorator(thePizza);
        //When
        String description= thePizza.getDescription();
        System.out.println("Opis pizzy: " + description);
        //Then
        assertEquals("Pizza (ciasto i sos pomidorowy z serem) + ham + mushrums + onion", description);
    }



}
