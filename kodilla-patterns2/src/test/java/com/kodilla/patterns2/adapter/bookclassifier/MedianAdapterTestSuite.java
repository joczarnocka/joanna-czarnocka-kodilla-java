package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("A1","T1",1987,"ADFS"));
        books.add(new Book("A2","T2",1988,"JSDFF"));
        books.add(new Book("A3","T3",1989,"SDVKLJ"));
        books.add(new Book("A4","T4",1990,"LKSDA"));
        books.add(new Book("A5","T5",1991,"DSLKJ"));
        books.add(new Book("A6","T6",1991,"VKODJ"));
        books.add(new Book("A7","T7",1993,"XDSKUL"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When

        int median = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(1990,median);
    }
}
