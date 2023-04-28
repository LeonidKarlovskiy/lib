package com.example.demolib.dao;

import com.example.demolib.domain.Author;

import java.util.List;

public interface AuthorDao extends GeneralDAO<Author> {

    List<Author> search(String... searchString);
}
