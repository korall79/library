//package com.example.library.service;
//
//import com.example.library.dao.AuthorDAO;
//import com.example.library.entity.Author;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//public class AuthorServiceImpl implements AuthorService {
//    private final AuthorDAO authorDAO;
//
//    public AuthorServiceImpl(AuthorDAO authorDAO) {
//        this.authorDAO = authorDAO;
//    }
//
//@Override
//    @Transactional           //открывает и закрывает транзакции
//    public List<Author> getAllAuthor() {
//        return authorDAO.getAllAuthor();
//    }
//
////    @Override
////    @Transactional
////    public void saveAuthor(Author employee) {
////        bookDAO.saveEmployee(book);
////    }
////
////    @Override
////    @Transactional
////    public Book getBook(int id) {
////        return bookDAO.getEmployee(id);
////    }
////
////    @Override
////    @Transactional
////    public void deleteBook(int id) {
////        bookDAO.deleteEmployee(id);
////    }
//}
