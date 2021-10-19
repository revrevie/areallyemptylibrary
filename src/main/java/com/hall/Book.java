package com.hall;

public class Book {

    /////Attributes
    private String bookTitle;
    private String author;
    private int refNumber;


    /////Constructors
    public Book(String bookTitle, String author, int refNumber){
        this.bookTitle = bookTitle;
        this.author = author;
        this.refNumber = refNumber;
    }

    public Book() {

    }

    /////Methods
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public String getBookTitle(){
        return bookTitle;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

    public void setRefNumber(int refNumber) {
        this.refNumber = refNumber;
    }
    public int getRefNumber() {
        return refNumber;
    }

    @Override
    public String toString(){
        return "{" +
                "\"Book \"" + bookTitle +
                "\"Author \"" + author +
                "\"Reference number \"" + refNumber +
                "}";

    }
}