package com.example.library.controller;


import com.example.library.entity.Book;

import com.example.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //управляет запросами и ответами
@RequestMapping("/api")
public class MyRESTController {

    private final BookService bookService;
   // private final AuthorService authorService;

    public MyRESTController(BookService bookService) {
        this.bookService = bookService;
   //     this.authorService = authorService;
    }

    @GetMapping("/books")
    public List<Book> showAllBook() {
        List<Book> allBook = bookService.getAllBook();
        return allBook;
    }
//    @GetMapping("/authors")
//    public List<Author> showAllAuthor() {
//        List<Author> allAuthor= authorService.getAllAuthor();
//        return allAuthor;
//    }

//    @GetMapping("/book/{id}")
//    public Book getBook(@PathVariable int id) {
//        Book book = bookService.getBook(id);
//        return book;
//    }
//
//    @PostMapping("/book")//добавление нового работника
//    public Book addNewBook(@RequestBody Book book) {
//
//        BookService.saveBook(book);
//        return book;
//    }
//
//    @PutMapping("/book")
//    public Book updateBook(@RequestBody Book book) {
//        bookService.saveBook(book);
//        return book;
//
//    }
//
//    @DeleteMapping("/book/{id}")
//    public String deleteBook(@PathVariable int id) {
//
//        bookService.deleteBook(id);
//        return "Employee with ID = " + id + " was deleted.";
//
//    }

}
