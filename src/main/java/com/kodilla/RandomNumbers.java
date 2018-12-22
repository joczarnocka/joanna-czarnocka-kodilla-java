package com.kodilla;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
* Celem zadania jest napisanie odpowiednich metod,
* aby sprawdzić ile losowań powinno się odbyć aby użytkownik
* trafił sześć liczb z sześciu wylosowanych.
Liczby losowane przez komputer powinny być z zakresu 1-49.
Liczby użytkownika mogą być wprowadzone ręcznie w kodzie,
wprowadzone przez Scanner bądź wylosowane.
* */
public class RandomNumbers {

    public static Set<Integer> findNumbers(int n){

        Set<Integer> numbers = new HashSet<>();

        Random random = new Random();

        while (numbers.size() < n) {
            int foundNumber = random.nextInt(49) + 1;
            numbers.add(foundNumber);
        }

        return numbers;
    }


    public static long getNumberOfRepetitionsBeforeRepeating(Set<Integer> foundNumbers){

        int counter = 1;

        Set<Integer> newNumbers = findNumbers(6);

        while (!(newNumbers.containsAll(foundNumbers))){
            counter ++;
            newNumbers = findNumbers(6);
        }

        return counter;
    }


    public static void main(String[] args) {
        Set<Integer> foundNumbers = new HashSet<>();
        foundNumbers = findNumbers(6);

        long resultsSum = 0;

        int numberOfRepeatitions = 5;

        for (int i=0; i< numberOfRepeatitions; i++){
            resultsSum += getNumberOfRepetitionsBeforeRepeating(foundNumbers);
            System.out.println("i=" + i);
        }

        //System.out.format("Średnia liczba losowań przed powtórzeniem wyniku: %,8d%n", (double) resultsSum / numberOfRepeatitions);
        System.out.printf("Średnia liczba losowań przed powtórzeniem wyniku: %d " , (double) resultsSum / numberOfRepeatitions);

    }

}
