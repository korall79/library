package com.example.library.dao;

import com.example.library.entity.Book;

import java.util.List;

public interface BookDAO {
    /**
     * возвращает список всех книг
     */
    public List<Book> getAllBook();

//    /**
//     * создание новой книги и изменение имеющейся
//     */
//    public void saveBook(Book book);

//    /**
//     * возвращает книгу по id
//      */
//    public Book getEmployee(int id);
//
//    /**
//     * удаляет книгу по id
//     */
//    public void deleteEmployee(int id);
}
