package com.example.library.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name="books")
public class Book {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "nameBook")
    private String nameBook;
    @Column(name = "genreBook")
    private String genreBook;
    @Column(name = "ratingBook")
    private int ratingBook;
    @Column(name = "author")
    private String author;

    public Book() {
    }

    public Book(int id, String nameBook, String genreBook, int ratingBook, String author) {

        this.nameBook = nameBook;
        this.genreBook = genreBook;
        this.ratingBook = ratingBook;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getGenreBook() {
        return genreBook;
    }

    public void setGenreBook(String genreBook) {
        this.genreBook = genreBook;
    }

    public int getRatingBook() {
        return ratingBook;
    }

    public void setRatingBook(int ratingBook) {
        this.ratingBook = ratingBook;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && ratingBook == book.ratingBook && Objects.equals(nameBook, book.nameBook) && Objects.equals(genreBook, book.genreBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameBook, genreBook, ratingBook, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nameBook='" + nameBook + '\'' +
                ", genreBook='" + genreBook + '\'' +
                ", ratingBook=" + ratingBook +
                ", author='" + author + '\'' +
                '}';
    }
}
