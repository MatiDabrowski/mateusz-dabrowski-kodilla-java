package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks(){
        //given

        Book book1 = new Book("title1", "author1", LocalDate.now());
        Book book2 = new Book("title2", "author2", LocalDate.now());
        Book book3 = new Book("title3", "author3", LocalDate.now());
        Book book4 = new Book("title4", "author4", LocalDate.now());

        Library library = new Library("Library 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        library.getBooks().remove(book1);
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);





        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(4, deepClonedLibrary.getBooks().size());

    }
}
