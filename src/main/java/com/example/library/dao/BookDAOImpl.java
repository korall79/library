package com.example.library.dao;

import com.example.library.entity.Book;
//import javax.persistence.EntityManager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {
@PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Book> getAllBook() {

        Session session = entityManager.unwrap(Session.class);       //открываем сессию
        Query<Book> query = session.createQuery("from Book",Book.class);
        List<Book> allBook = query.getResultList();                  //получаем список

        return allBook;
    }

//    @Override
//    public void saveBook(Book book) {
//        Session session = sessionFactory.getCurrentSession();
//
//        session.saveOrUpdate(book);//добавляет или меняет данные работника
//    }
//
//    @Override
//    public Book getBook(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Book book = session.get(Book.class, id);
//        return book;
//    }
//
//    @Override
//    public void deleteBook(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Query<Book> query = session.createQuery("delete from Book " +
//                "where id =:bookId");
//        query.setParameter("employeeId", id);
//        query.executeUpdate(); //отвечает за изменение и удаление
//    }
}