package com.example.library.service;


import com.example.library.entity.Author;
import java.util.List;

public interface AuthorService {

    public List<Author> getAllAuthor();

    public void saveAuthor(Author author);

    public Author getAuthor(int id);
    public void deleteAuthor(int id);


}
