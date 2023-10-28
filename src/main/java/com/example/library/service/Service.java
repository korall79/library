package com.example.library.service;

import com.example.library.entity.Book;

import java.util.List;
import java.util.Optional;

public interface Service <T> {
    public List<T> getAll();

    public void save(T  t);

    //public Book get  (int id);
    Optional<T> get(int id);

//    public void delete(int id);
}
