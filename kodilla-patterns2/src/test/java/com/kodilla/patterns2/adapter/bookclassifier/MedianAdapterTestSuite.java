package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    private final static Set<Book> booksA = new HashSet<>();

    @BeforeAll
    static void setup() {
        booksA.add(new Book("author1", "title1", 1995, "1111111111"));
        booksA.add(new Book("author2", "title2", 1998, "1111111112"));
        booksA.add(new Book("author3", "title3", 2010, "1111111113"));
        booksA.add(new Book("author4", "title4", 2005, "1111111114"));
        booksA.add(new Book("author5", "title5", 2001, "1111111115"));
        booksA.add(new Book("author6", "title6", 1999, "1111111116"));
        booksA.add(new Book("author7", "title7", 1853, "1111111117"));
        booksA.add(new Book("author8", "title8", 2020, "1111111118"));
        booksA.add(new Book("author9", "title9", 1958, "1111111119"));
    }

    @Test
    void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(booksA);
        System.out.println(median);
        //Then
        assertEquals(1999, median);


    }
}
