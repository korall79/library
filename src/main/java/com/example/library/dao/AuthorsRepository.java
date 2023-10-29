package com.example.library.dao;

import com.example.library.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorsRepository extends JpaRepository<Author,Integer> {


}
