package com.kodilla;

import java.util.ArrayList;
import java.util.List;

public class PrimaryNumbers {

    //List<Integer> primes = new ArrayList<>;

    boolean checkIsPrime(int n){
       int divCandidate = 2;
       while (divCandidate <= Math.sqrt(n)){
        if (n % divCandidate == 0){
            return false;
        }
        divCandidate++;

       }
       return true;
    }

    int get(int n){
        int actPrime = 2;
        int primesCnt = 1;

        while (primesCnt < n){
            actPrime ++;
            if (checkIsPrime(actPrime)) {
                primesCnt++;
            }
        }
        return actPrime;
    }

}
