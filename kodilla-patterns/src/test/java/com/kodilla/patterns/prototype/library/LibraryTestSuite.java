package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    private Library shallowCopyLibrary;
    private Library deepCopyLibrary;

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("First library");
        Book book1 = new Book("Title1", "Author1", LocalDate.of(2000,12,12));
        Book book2 = new Book("Title2", "Author2", LocalDate.of(1900,6,2));
        Book book3 = new Book("Title3", "Author3", LocalDate.of(1950,1,4));
        Book book4 = new Book("Title4", "Author4", LocalDate.of(1970,7,30));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        try {
            shallowCopyLibrary = library.shallowCopy();
            deepCopyLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        shallowCopyLibrary.getBooks().remove(book4);
        shallowCopyLibrary.setName("Shallow Copy Library");
        deepCopyLibrary.setName("Deep Copy Library");

        //Then
        System.out.println(library + "\n" + shallowCopyLibrary + "\n" + deepCopyLibrary);
        assertEquals(3, shallowCopyLibrary.getBooks().size());
        assertEquals(3, library.getBooks().size());
        assertEquals(4, deepCopyLibrary.getBooks().size());
    }
}
