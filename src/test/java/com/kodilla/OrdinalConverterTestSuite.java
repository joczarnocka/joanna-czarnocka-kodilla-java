package com.kodilla;

import org.junit.Test;
import static org.junit.Assert.*;

public class OrdinalConverterTestSuite {

    /*Napisz metodę dodającą angielskie "końcówki" do liczb.
    st dla liczb kończących się cyfrą 1 (1st, first)
    nd dla liczb kończących się cyfrą 2 (92nd, ninety-second)
    rd dla liczb kończących się cyfrą 3 (e.g. 33rd, pronounced thirty-third)
    th dla pozostałych cyfr (9th, ninth).

    Załóż, że do metody zawsze będzie przekazana liczba nieujemna.
    Wyjątkiem od powyższej reguły są liczby z zakresu 11-19 (wszystkie mają końcówkę th).

    Testy: */

    OrdinalConverter ordinalConverter = new OrdinalConverter();

    @Test
    public void shouldHandleSingleDigits() {
        assertEquals("0", ordinalConverter.numberToOrdinal(0));
        assertEquals("1st", ordinalConverter.numberToOrdinal(1));
        assertEquals("2nd", ordinalConverter.numberToOrdinal(2));
        assertEquals("3rd", ordinalConverter.numberToOrdinal(3));
        assertEquals("5th", ordinalConverter.numberToOrdinal(5));
    }

    @Test
    public void shouldHandleEdgeCases() {
        assertEquals("11th", ordinalConverter.numberToOrdinal(11));
        assertEquals("12th", ordinalConverter.numberToOrdinal(12));
        assertEquals("13th", ordinalConverter.numberToOrdinal(13));
        assertEquals("103rd", ordinalConverter.numberToOrdinal(103));
        assertEquals("113th", ordinalConverter.numberToOrdinal(113));
    }

    @Test
    public void shouldHandleMultipleDigits() {
        assertEquals("21st", ordinalConverter.numberToOrdinal(21));
        assertEquals("22nd", ordinalConverter.numberToOrdinal(22));
        assertEquals("23rd", ordinalConverter.numberToOrdinal(23));
        assertEquals("75th", ordinalConverter.numberToOrdinal(75));
        assertEquals("455th", ordinalConverter.numberToOrdinal(455));
    }
}
