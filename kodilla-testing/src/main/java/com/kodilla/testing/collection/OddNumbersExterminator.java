package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> res = new ArrayList<>();
        for (Integer n : numbers){
            if (n % 2 == 0)
                res.add(n);
        }
        return res;
    }

}
