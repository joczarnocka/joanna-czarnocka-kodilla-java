package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer n : numbers){
            if (n % 2 == 0)
                res.add(n);
        }
        return res;
    }

}
