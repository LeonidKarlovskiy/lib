package com.example.demolib.dao;

import java.util.List;

public interface GeneralDAO<T>{
    List<T> getAll();
    T get(long id);

    T save(T obj);

    void delete(T object);
}
