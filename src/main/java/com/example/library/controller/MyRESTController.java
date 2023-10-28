package com.example.library.controller;


import com.example.library.entity.Author;
import com.example.library.entity.Book;
import com.example.library.service.Service;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController  //управляет запросами и ответами
@RequestMapping("/api")
public class MyRESTController {

    private final Service bookService;
    private final Service authorService;

    public MyRESTController(@Qualifier("bookServiceImpl") Service bookService,
                            @Qualifier("authorServiceImpl") Service authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @GetMapping("/books")
    public List<Book> showAllBook() {
        List<Book> allBook = bookService.getAll();
        return allBook;
    }

    @GetMapping("/authors")
    public List<Author> showAllAuthor() {
        List<Author> allAuthor = authorService.getAll();
        return allAuthor;
    }

    @GetMapping("/books/{id}")
    public Optional getBook(@PathVariable int id) {
        Optional book = bookService.get(id);
        return book;
    }

    @GetMapping("/authors/{id}")
    public Optional getAuthor(@PathVariable int id) {
        Optional author = authorService.get(id);
        return author;
    }

    @PostMapping("/books")//добавление новой книги
    public Book addNewBook(@RequestBody Book book) {
        bookService.save(book);
        return book;
    }

    @PostMapping("/authors")//добавление автора
    public Author addNewAuthor(@RequestBody Author author) {
        authorService.save(author);
        return author;
    }

//    @PutMapping("/books")
//    public Book updateBook(@RequestBody Book book) {
//        bookService.saveBook(book);
//        return book;
//
//    }

//    @DeleteMapping("/books/{id}")
//    public String deleteBook(@PathVariable int id) {
//
//        bookService.deleteBook(id);
//        return "Employee with ID = " + id + " was deleted.";
//
//    }

}
