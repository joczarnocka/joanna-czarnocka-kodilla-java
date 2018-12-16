package com.kodilla;

public class Masking {
    /*
    Napisz program, który będzie maskował/ukrywał cyfry w ciągu znaków.
Warunki:
- maskowane powinny być tylko liczby, litery zostają bez zmian
- maskowane powinny być tylko łańcuchy znakowe, w których liczba cyfr jest większa od 6
- po ukryciu/zamaskowaniu, powinna być widoczna tylko pierwsza cyfra oraz cztery ostatnie
- zamiast pozostałych cyfr powinny być znaki #
*/



    public String maskify(String input){
         if (input == null || input.equals(""))
             return "";
         if (input.length() <= 6)
            return input;

//         int digitNumber = 0;
//         for (int i=0; i< input.length(); i++){
//
//            char ch = input.charAt(i);
//
//        }

        String tmpInput = input.replaceAll("\\D","");
        if (tmpInput.length() <= 6)
            return input;

        String middleInput = input.substring(1, input.length()-4);
        return input.substring(0,1) + middleInput.replaceAll("[0-9]","#") +
                input.substring(input.length()-4);

    }

  /*
    @Test
    public void shouldMaskDigitsForBasicCreditCards() {
        assertEquals("5###########0694", creditCard.maskify("5512103073210694"));
    }

    @Test
    public void shouldMaskDigitsForDifferentLengths() {
        assertEquals("6######5616", creditCard.maskify("64607935616"));
    }


    @Test
    public void shouldMaskDigitsForCreditCardsWithDashes() {
        assertEquals("4###-####-####-5616", creditCard.maskify("4556-3646-0793-5616"));
    }

    @Test
    public void shouldNotMaskString() {
        assertEquals("Skippy", creditCard.maskify("Skippy"));
    }

    @Test
    public void shouldHandleEmptyString() {
        assertEquals("", creditCard.maskify(""));
        assertEquals("", creditCard.maskify(null));
    }

    @Test
    public void shouldNotMaskIfShorterThanDesiredLength() {
        assertEquals("12345asdf", creditCard.maskify("12345asdf"));
        assertEquals("12345", creditCard.maskify("12345"));
        assertEquals("123", creditCard.maskify("123"));
    }
    * */

}
