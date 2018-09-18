package com.kodilla;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumbersTestSuite {

    @Test
    public void test_prime_number_2() {
        //Given
        PrimaryNumbers pn = new PrimaryNumbers();

        //When
        boolean res = pn.checkIsPrime(2);
        //Then
        Assert.assertTrue(res);
    }


    @Test
    public void test_prime_number_5() {
        //Given
        PrimaryNumbers pn = new PrimaryNumbers();

        //When
        boolean res = pn.checkIsPrime(5);
        //Then
        Assert.assertTrue(res);
    }


    @Test
    public void test_prime_number_8() {
        //Given
        PrimaryNumbers pn = new PrimaryNumbers();

        //When
        boolean res = pn.checkIsPrime(8);
        //Then
        Assert.assertFalse(res);
    }

    @Test
    public void test_prime_number_541() {
        //Given
        PrimaryNumbers pn = new PrimaryNumbers();

        //When
        boolean res = pn.checkIsPrime(541);
        //Then
        Assert.assertTrue(res);
    }


    @Test
    public void test_prime_number_1223() {
        //Given
        PrimaryNumbers pn = new PrimaryNumbers();

        //When
        boolean res = pn.checkIsPrime(1223);
        //Then
        Assert.assertTrue(res);
    }


    @Test
    public void test_prime_number_543() {
        //Given
        PrimaryNumbers pn = new PrimaryNumbers();

        //When
        boolean res = pn.checkIsPrime(543);
        //Then
        Assert.assertFalse(res);
    }


    @Test
    public void test_get_1st() {
        //Given
        PrimaryNumbers pn = new PrimaryNumbers();

        //When
        int res = pn.get(1);
        //Then
        Assert.assertEquals(2, res);
    }


    @Test
    public void test_get_5th() {
        //Given
        PrimaryNumbers pn = new PrimaryNumbers();

        //When
        int res = pn.get(5);
        //Then
        Assert.assertEquals(11, res);
    }


    @Test
    public void test_get_1000th() {
        //Given
        PrimaryNumbers pn = new PrimaryNumbers();

        //When
        int res = pn.get(1000);
        //Then
        Assert.assertEquals(7919, res);
    }


    @Test
    public void test_get_100000th() {
        //Given
        PrimaryNumbers pn = new PrimaryNumbers();

        //When
        int res = pn.get(100000);
        //Then
        Assert.assertEquals(1299709, res);
    }
}
