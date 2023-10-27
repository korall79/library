package com.example.library.service;

import com.example.library.dao.DAO;
import com.example.library.entity.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@org.springframework.stereotype.Service   //соединяет контроллер и ДАО
public class BookServiceImpl implements Service {
    private final DAO bookDAO;

    public BookServiceImpl(DAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    @Transactional           //открывает и закрывает транзакции
    public List<Book> getAll() {
        return bookDAO.getAll();
    }

    @Override
    @Transactional
    public void save(Book book) {
        bookDAO.save(book);
    }

    @Override
    @Transactional
    public Book get(int id) {
        return bookDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        bookDAO.delete(id);
    }
}
