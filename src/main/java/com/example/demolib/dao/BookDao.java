package com.example.demolib.dao;

import com.example.demolib.domain.Book;

import java.util.List;

public interface BookDao extends GeneralDAO<Book> {

    List<Book> search(String... searchString);

    List<Book> findTopBooks(int limit);
}
