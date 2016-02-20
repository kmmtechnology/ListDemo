package com.demo.listdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 15-Feb-16.
 */
public class BookStore {

  public static List<Book> getBooks(){

    List<Book> books=new ArrayList<Book>();
    books.add(new Book("A","AAA"));
      books.add(new Book("B","BB"));
      books.add(new Book("C","CC"));
      books.add(new Book("D","DDDD"));
      books.add(new Book("E","EE"));

    return books;
  }
}
