package com.example.library.service;

import com.example.library.dao.DAO;
import com.example.library.entity.Author;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class AuthorServiceImpl implements Service<Author> {
    private final DAO authorDAO;

    public AuthorServiceImpl(@Qualifier("authorDAOImpl") DAO authorDAO) {
        this.authorDAO = authorDAO;
    }
    @Override
    @Transactional           //открывает и закрывает транзакции
    public List<Author> getAll() {
        return authorDAO.getAll();
    }


    @Override
    @Transactional
    public void save(Author author) {
      authorDAO.save(author);
    }

    // @Override
    @Transactional
    // public Book get(int id) {

    @Override
    public Optional<Author> get(int id) {
        return authorDAO.get(id);

    }

//    @Override
//    @Transactional
//    public void delete(int id) {
//        bookDAO.delete(id);
//    }

}
