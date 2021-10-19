package com.hall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static ArrayList<String> listOfBooks;
    static ArrayList<String> listofComics;
    static ArrayList<Integer> listofNewspaperDates;


    public static void main(String[] args) {
        listOfBooks = new ArrayList<>();
        listofComics = new ArrayList<>();
        listofNewspaperDates = new ArrayList<>();
        Scanner key = new Scanner(System.in);


        for (; true; ) {
            System.out.println("To access the Book library, enter 1. To access the Comics library, enter 2.");
            int decide = key.nextInt();
            switch (decide) {
                case 1 -> bookLibrary();
                case 2 -> comicLibrary();
                default -> System.out.println("Come on man, there were only 2 choices.");
            }
            //System.out.println("The current list of books is: " + listOfBooks);

        }
    }

    public static void bookLibrary() {
        System.out.println("Welcome to the Book library.");
        System.out.println("What would you like to do?");
        Scanner choice = new Scanner(System.in);
        for (; true; ) {
            System.out.println("Press 0 to view the current library. Press 1 to add a new Book into the library. Press 2 to remove a Book from the library. Press 3 to return to the lobby.");
            int decide = choice.nextInt();
            switch (decide) {
                case 0 -> listFetch();
                case 1 -> addBook();
                case 2 -> removeBook();
                case 3 -> {
                    return;
                }
                default -> System.out.println("Not that difficult bud.");
            }
        }

    }

    public static void listFetch() {
        System.out.println("Prepare yourself");
        System.out.println(Arrays.toString(listOfBooks.toArray()));
    }

    public static void comicLibrary() {
        System.out.println("Welcome to the Comic library. The current available comics are: " + listofComics + ".");
        System.out.println("What would you like to do?");
        Scanner choice = new Scanner(System.in);
        for (; true; ) {
            System.out.println("Press 1 to add a new Comic into the library. Press 2 to remove a Comic from the library. Press 3 to return to the lobby.");
            int decide = choice.nextInt();
            switch (decide) {
                case 1 -> addComic();
                case 2 -> removeComic();
                case 3 -> {
                    return;
                }
                default -> System.out.println("Not that difficult bud.");
            }
        }
    }


    public static void addComic() {
        Scanner word = new Scanner(System.in);
        Comic comic = new Comic();
        System.out.println("How many comics?");
        int comicNumber = word.nextInt();
        while (comicNumber > 0) {
            System.out.println("What is the title of the book? No spaces");
            comic.setComicTitle(word.next());
            System.out.println("Who is the Main Author?");
            comic.setComicAuthors(word.next());
            System.out.println("Who is the Lead Artist?");
            comic.setComicArtists(word.next());
            listofComics.add(comic.getComicTitle());
            comicNumber--;
        }
    }

    public static void removeComic() {
        Scanner remove = new Scanner(System.in);
        System.out.println("The current available comics are: " + listofComics);
        System.out.println("What comic would you like to remove?");
        listofComics.remove(remove.nextLine());
    }


    public static void removeBook() {
        Scanner remove = new Scanner(System.in);
        System.out.println("The current available books are: " + listOfBooks);
        System.out.println("What book would you like to remove?");
        listOfBooks.remove(remove.nextLine());
    }

    public static void addBook() {
        Scanner names = new Scanner(System.in);
        Book book = new Book();
        System.out.println("How many books?");
        int bookNumber = names.nextInt();
        while (bookNumber > 0) {
            System.out.println("What is the title of the book? No spaces");
            book.setBookTitle(names.next());
            System.out.println("Who is the Author?");
            book.setAuthor(names.next());
            System.out.println("What is the reference number?");
            book.setRefNumber(names.nextInt());
            listOfBooks.add(book.getBookTitle());
            bookNumber--;
        }
        //System.out.println("The current list of books is:" + listOfBooks);
    }
}
