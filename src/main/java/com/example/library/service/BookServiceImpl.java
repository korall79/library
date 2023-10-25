package com.example.library.service;

import com.example.library.dao.BookDAO;
import com.example.library.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service   //соединяет контроллер и ДАО
public class BookServiceImpl implements BookService{
    private final BookDAO bookDAO;

    public BookServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    @Transactional           //открывает и закрывает транзакции
    public List<Book> getAllBook() {
        return bookDAO.getAllBook();
    }

//    @Override
//    @Transactional
//    public void saveBook(Book employee) {
//        bookDAO.saveEmployee(book);
//    }
//
//    @Override
//    @Transactional
//    public Book getBook(int id) {
//        return bookDAO.getEmployee(id);
//    }
//
//    @Override
//    @Transactional
//    public void deleteBook(int id) {
//        bookDAO.deleteEmployee(id);
//    }
}
