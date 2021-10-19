package com.hall;

import java.util.ArrayList;
import java.util.List;

public class BookInventory extends Book{
    private Book book;
    List<Book> bookList = new ArrayList<>();

    public BookInventory(Book book) {
        this.bookList.add(book);
    }

    public BookInventory(String bookTitle, String author, int refNumber, Book book, List<Book> bookList) {
        super(bookTitle, author, refNumber);
        this.book = book;
        this.bookList = bookList;
    }

    public BookInventory(Book book, List<Book> bookList) {
        this.book = book;
        this.bookList = bookList;
    }

    public BookInventory() {

    }

    public String getBookList() {
        String bookTitle;
        String bookAuthor;
        for (Book book : bookList) {
            bookTitle = getBookTitle();
            bookAuthor = getAuthor();
            System.out.println("Book: " + bookTitle + ", By " + bookAuthor);
        } return null;
    }

}
