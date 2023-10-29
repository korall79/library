package com.example.library.dao;

import com.example.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book,Integer> {


}
