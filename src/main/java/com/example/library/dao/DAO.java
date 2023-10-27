package com.example.library.dao;

import com.example.library.entity.Book;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    /**
     * возвращает список всех
     */
    public List<T> getAll();

    /**
     * создание  и изменение имеющейся
     */
     public void save(T t);

    /**
     * возвращает объект по id
      */
    Optional<T> get(int id);

    /**
     * удаляет книгу по id
     */
     void delete(int id);


}
