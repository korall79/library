package com.example.library.controller;

import com.example.library.entity.Author;
import com.example.library.entity.Book;
import com.example.library.service.AuthorService;
import com.example.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //управляет запросами и ответами
@RequestMapping("/api")
public class MyRESTController {

    private final BookService bookService;
    private final AuthorService authorService;

    public MyRESTController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @GetMapping("/books")
    public List<Book> showAllBook() {
        List<Book> allBook = bookService.getAllBook();
        return allBook;
    }

    @GetMapping("/authors")
    public List<Author> showAllAuthor() {
        List<Author> allAuthor = authorService.getAllAuthor();
        return allAuthor;
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable int id) {
        Book book = bookService.getBook(id);
        return book;
    }

    @GetMapping("/authors/{id}")
    public Author getAuthor(@PathVariable int id) {
        Author author = authorService.getAuthor(id);
        return author;
    }

    @PostMapping("/books")//добавление новой книги
    public Book addNewBook(@RequestBody Book book) {
        bookService.saveBook(book);
        return book;
    }

    @PostMapping("/authors")//добавление автора
    public Author addNewAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
        return author;
    }

    @DeleteMapping("/authors/{id}")
    public String deleteAuthors(@PathVariable int id) {
        authorService.deleteAuthor(id);
        return "Author with ID = " + id + " was deleted";

    }
    @DeleteMapping("/books/{id}")
    public String deleteBooks(@PathVariable int id) {
        bookService.deleteBook(id);
        return "Book with ID = " + id + " was deleted";

    }

}
