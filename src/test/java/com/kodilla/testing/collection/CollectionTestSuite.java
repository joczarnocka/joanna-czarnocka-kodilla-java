package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case for Collection - begin");
    }

    @After
    public void after(){
        System.out.println("Test Case for Collection - end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList()
    //(sprawdzi, czy klasa zachowuje się poprawnie, gdy lista jest pusta)
    {   //Given
        System.out.println("Test OddNumbersExterminatorEmptyList");
        OddNumbersExterminator filter = new OddNumbersExterminator();
        //When
        ArrayList<Integer> empty = new ArrayList<>();
        ArrayList<Integer> result = filter.exterminate(empty);
        // Then
        Assert.assertEquals(result, empty);
    }

    @Test
    public void testOddNumbersExterminatorNormalList()
    //(sprawdzi, czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste)
    {
        //Given
        System.out.println("Test OddNumbersExterminatorNormalList");
        OddNumbersExterminator filter = new OddNumbersExterminator();
        //When
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(11);
        input.add(20);
        input.add(100);
        input.add(201);
        ArrayList<Integer> result = filter.exterminate(input);
        // Then
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(20);
        expectedResult.add(100);
        Assert.assertEquals(result, expectedResult);
    }
}
