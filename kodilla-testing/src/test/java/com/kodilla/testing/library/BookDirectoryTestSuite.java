package com.kodilla.testing.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;
    private BookLibrary bookLibrary;

    @BeforeEach
    public void before() {
        bookLibrary = new BookLibrary(libraryDatabaseMock);
    }

    private List<Book> generateListOfBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int i = 1; i <= booksQuantity; i++) {
            Book theBook = new Book("Title " + i, "Author " + i, 1970 + i);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testListBooksWithConditionsReturnList() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfBooks(15);
        List<Book> resultListOf40Books = generateListOfBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksInHandsOf() {
        //Given
        List<Book> result0HandsBookList = generateListOfBooks(0);
        List<Book> result1HandsBookList = generateListOfBooks(1);
        List<Book> result5HandsBookList = generateListOfBooks(5);
        LibraryUser libraryUser1 = new LibraryUser("Tomasz","Nowak","111111");
        LibraryUser libraryUser2 = new LibraryUser("Andrzej","Kowalski","222222");
        LibraryUser libraryUser3 = new LibraryUser("Mariusz", "Leśny","333333");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(result0HandsBookList);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser2)).thenReturn(result1HandsBookList );
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser3)).thenReturn(result5HandsBookList);

        //When
        List<Book> theListOfHandsBooks0 = bookLibrary.listBooksInHandsOf(libraryUser1);
        List<Book> theListOfHandsBooks1 = bookLibrary.listBooksInHandsOf(libraryUser2);
        List<Book> theListOfHandsBooks5 = bookLibrary.listBooksInHandsOf(libraryUser3);

        //Then
        assertEquals(0, theListOfHandsBooks0.size());
        assertEquals(1, theListOfHandsBooks1.size());
        assertEquals(5, theListOfHandsBooks5.size());
    }
}

