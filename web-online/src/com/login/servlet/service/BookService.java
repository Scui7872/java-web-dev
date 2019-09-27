package com.login.servlet.service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
*@ClassName BookService
*@Description  TODO
*@author crj
*Data 
*@Version 1.0
**/
public class BookService {
    private static List<Book> bookList;

    public static List<Book> init() {
        bookList = new ArrayList<>(8);
        Book[] books = {
                new Book( ),
                new Book( ),
                new Book( ),
                new Book( ),
                new Book( ),
                new Book( ),
                new Book( ),
                new Book( ),

        };
        bookList = Arrays.asList(books);
        return bookList;
    }
}


