package com.example.library.service;

import com.example.library.dao.AuthorsRepository;
import com.example.library.entity.Author;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorsRepository authorsRepository;

    public AuthorServiceImpl(AuthorsRepository authorsRepository) {
        this.authorsRepository = authorsRepository;
    }

    /**
     * получение всех авторов
     */
    @Override
    public List<Author> getAllAuthor() {
        return authorsRepository.findAll();
    }


    /**
     * добавляем нового автора
     */
    @Override
    public void saveAuthor(Author author) {
        authorsRepository.save(author);
    }

    /**
     * получение автора по айди
     */
    @Override
    public Author getAuthor(int id) {
        Author author = null;
        Optional<Author> optionalAuthor = authorsRepository.findById(id);
        if (optionalAuthor.isPresent()) {
            author = optionalAuthor.get();
        }
        return author;
    }

    @Override
    public void deleteAuthor(int id) {
        authorsRepository.deleteById(id);
    }

}
