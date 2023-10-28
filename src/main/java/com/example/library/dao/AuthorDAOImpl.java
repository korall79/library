package com.example.library.dao;

import com.example.library.entity.Author;
import com.example.library.entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AuthorDAOImpl implements DAO<Author> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Author> getAll() {
        Session session = entityManager.unwrap(Session.class);       //открываем сессию
        Query<Author> query = session.createQuery("from Author", Author.class);
        List<Author> allAuthor = query.getResultList();                  //получаем список
        return allAuthor;
    }

    @Override
    public void save(Author author) {
        Author newAuthor = entityManager.merge(author);
        author.setId(newAuthor.getId());

    }

    @Override
    public Optional<Author> get(int id) {
        Author author = entityManager.find(Author.class, id);
        return Optional.ofNullable(author);
    }
}
