package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("library 1");
        Book book1 = new Book("Title 1", "Author 1", LocalDate.of(2000, 01, 02));
        library.getBooks().add(book1);
        library.getBooks().add(new Book("Title 2", "Author 2", LocalDate.of(2001, 01, 02)));
        library.getBooks().add(new Book("Title 3", "Author 3", LocalDate.of(2002, 01, 02)));

        //making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        Set<Book> books = library.getBooks();
        books.remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }
}
