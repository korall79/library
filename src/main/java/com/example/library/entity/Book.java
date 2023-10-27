package com.example.library.entity;
//

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
    @Column(name = "name")
    private String name;
    @Column(name = "genre")
    private String genre;
    @Column(name = "rating")
    private int rating;
    @Column(name = "author")
    private String author;

    public Book() {
    }

    public Book(int id, String nameBook, String genreBook, int ratingBook, String author) {

        this.name = nameBook;
        this.genre = genreBook;
        this.rating = ratingBook;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameBook) {
        this.name = nameBook;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genreBook) {
        this.genre = genreBook;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int ratingBook) {
        this.rating = ratingBook;
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
        return id == book.id && rating == book.rating && Objects.equals(name, book.name) && Objects.equals(genre, book.genre) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, genre, rating, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nameBook='" + name + '\'' +
                ", genreBook='" + genre + '\'' +
                ", ratingBook=" + rating +
                ", author='" + author + '\'' +
                '}';
    }
}
