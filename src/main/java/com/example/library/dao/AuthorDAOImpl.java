//package com.example.library.dao;
//
//import com.example.library.entity.Author;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import org.hibernate.Session;
//import org.hibernate.query.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class AuthorDAOImpl implements AuthorDAO {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public List<Author> getAllAuthor() {
//        Session session = entityManager.unwrap(Session.class);       //открываем сессию
//        Query<Author> query = session.createQuery("from Author",Author.class);
//        List<Author> allAuthor= query.getResultList();                  //получаем список
//        return allAuthor;
//    }
//}
