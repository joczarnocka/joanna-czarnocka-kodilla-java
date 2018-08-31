package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int[10];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 60;
        numbers[6] = 70;
        numbers[7] = 80;
        numbers[8] = 90;
        numbers[9] = 100;

        //When
        double avg = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(55.0, avg,0.001);
    }

    @Test
    public void testGetAverageEmptyArray(){
        //Given
        int[] numbers = new int[0];

        //When
        double avg = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(0.0, avg,0.001);
    }
}
