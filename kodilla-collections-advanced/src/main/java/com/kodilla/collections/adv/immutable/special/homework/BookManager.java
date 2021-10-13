package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {



    public static Book createBook(String title, String author){
        Book book = new Book(title, author);
        for (Book b : books){
            if (b.equals(book)){
                return b;
            }
        }
        books.add(book);
        return book;
    }

    public static Set<Book> books = new HashSet<>();



}
