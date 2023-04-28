package com.example.demolib.dao;

import com.example.demolib.domain.Genre;

import java.util.List;

public interface GenreDAo extends GeneralDAO<Genre> {
    List<Genre> search(String... searchString);
}
