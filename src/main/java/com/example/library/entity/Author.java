package com.example.library.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String nameAuthor;
    @Column(name = "passport")
    private int passport;
    @Column(name = "country")
    private String country;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    private List<Book> bk;

    public Author() {
    }

    public Author(int id, String nameAuthor, int passport, String country) {

        this.nameAuthor = nameAuthor;
        this.passport = passport;
        this.country = country;
    }

    public void addBookToAuthor(Book book) {
        if (bk == null) {
            bk = new ArrayList<>();
        }
        bk.add(book);
        book.setAuthor(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Book> getBk() {
        return bk;
    }

    public void setBk(List<Book> bk) {
        this.bk = bk;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", nameAuthor='" + nameAuthor + '\'' +
                ", passport=" + passport +
                ", country='" + country + '\'' +
                '}';
    }
}
