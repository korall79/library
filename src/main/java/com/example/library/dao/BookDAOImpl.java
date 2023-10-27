package com.example.library.dao;

import com.example.library.entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
//import org.hibernate.Session;
//import org.hibernate.query.Query;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BookDAOImpl implements DAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Book> getAll() {
        Query query = entityManager.createQuery("from Book");
        List<Book> allBook = query.getResultList();
        return allBook;
    }

    @Override
    public void save(Book book) {
        Book newBook = entityManager.merge(book);
        book.setId(newBook.getId());

    }
        @Override
        public Optional<Book> get (int id){
            Book book = entityManager.find(Book.class, id);
            return Optional.ofNullable(book);
        }

        @Override
        public void delete(int id){
            Query query = entityManager.createQuery("delete from Book " +
                    "where id =:bookId");
            query.setParameter("bookId", id);
            query.executeUpdate(); //отвечает за изменение и удаление
        }
    }