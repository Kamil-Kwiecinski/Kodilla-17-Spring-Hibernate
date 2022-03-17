package com.kodilla.stream.book;

public class Book {
    private String author;
    private String title;
    private int yearOfPublication;
    private String signature;

    public Book(String author, String title, int yearOfPublication, String signature) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString(){
        return "Book{ " + " author='" + author + "\'" + ", title='" + title + "\'" + ", yearOfPublication= " + yearOfPublication + ", signature='"+ signature + '\'' + '}';
    }
}
