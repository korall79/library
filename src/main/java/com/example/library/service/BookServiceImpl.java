package com.example.library.service;

import com.example.library.dao.DAO;
import com.example.library.entity.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@org.springframework.stereotype.Service   //соединяет контроллер и ДАО
public class BookServiceImpl implements Service<Book> {
    private final DAO bookDAO;

    public BookServiceImpl(@Qualifier("bookDAOImpl") DAO bookDAO) {
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

   // @Override
    //@Transactional
   // public Book get(int id) {

    @Override
    public Optional<Book> get(int id) {
        return bookDAO.get(id);

    }

//    @Override
//    @Transactional
//    public void delete(int id) {
//        bookDAO.delete(id);
//    }
}
