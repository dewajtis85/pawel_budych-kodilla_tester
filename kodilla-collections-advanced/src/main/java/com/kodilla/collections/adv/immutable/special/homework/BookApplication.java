package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

import static com.kodilla.collections.adv.immutable.special.homework.BookManager.books;

public class BookApplication {
    public static void main(String[] args) {
        BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");
        BookManager.createBook("Potop", "Henryk Sienkiewicz");
        BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");

        Book book1 = BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");
        Book book2 = BookManager.createBook("Potop", "Henryk Sienkiewicz");
        Book book3 = BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");


        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());










        }


        }






