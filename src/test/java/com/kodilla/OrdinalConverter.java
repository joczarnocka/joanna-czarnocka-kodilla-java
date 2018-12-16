package com.kodilla;

public class OrdinalConverter {

    private String prepareForNormalCases(int n){

        int lastDigit =  n % 10;

        switch(lastDigit){
            case 1: return "" +n +"st";
            case 2: return "" +n +"nd";
            case 3: return "" +n +"rd";
            default: return "" + n + "th";
        }
    }

    private String prepareForEdgeCases(int n) {
        int last2Digits = n % 100;

        if (last2Digits>= 10 && last2Digits <=20){
            return "" + n + "th";
        }

        return null;
    }

    public String numberToOrdinal(int n){

        if (n == 0) return "0";

        String res = prepareForEdgeCases(n);
        if (res != null)
            return res;
        else
            return prepareForNormalCases(n);

    }
}
