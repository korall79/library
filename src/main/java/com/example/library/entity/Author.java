//package com.example.library.entity;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//import java.util.Objects;
//
//@Entity
//@Table(name = "authors")
//public class Author {
//    @Id
//    @Column(name = "id")
//    private int id;
//    @Column(name = "nameAuthor")
//    private String nameAuthor;
//    @Column(name = "passport")
//    private int passport;
//    @Column(name = "country")
//    private String country;
//
//    public Author() {
//    }
//
//    public Author(int id, String nameAuthor, int passport, String country) {
//
//        this.nameAuthor = nameAuthor;
//        this.passport = passport;
//        this.country = country;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getNameAuthor() {
//        return nameAuthor;
//    }
//
//    public void setNameAuthor(String nameAuthor) {
//        this.nameAuthor = nameAuthor;
//    }
//
//    public int getPassport() {
//        return passport;
//    }
//
//    public void setPassport(int passport) {
//        this.passport = passport;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Author author = (Author) o;
//        return id == author.id && passport == author.passport && Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(country, author.country);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, nameAuthor, passport, country);
//    }
//
//    @Override
//    public String toString() {
//        return "Author{" +
//                "id=" + id +
//                ", nameAuthor='" + nameAuthor + '\'' +
//                ", passport=" + passport +
//                ", country='" + country + '\'' +
//                '}';
//    }
//}
