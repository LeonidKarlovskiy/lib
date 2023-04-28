package com.example.demolib.dao;

import com.example.demolib.domain.Publisher;

import java.util.List;

public interface PublisherDao extends GeneralDAO<Publisher> {

    List<Publisher> search(String... searchString);
}
