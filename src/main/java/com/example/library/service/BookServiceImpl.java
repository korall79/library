package com.example.library.service;

import com.example.library.dao.BooksRepository;
import com.example.library.entity.Book;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service   //соединяет контроллер и ДАО
public class BookServiceImpl implements BookService {

    private final BooksRepository booksRepository;

    public BookServiceImpl(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    /**
     * получем все книги
     */
    @Override
    public List<Book> getAllBook() {
        return booksRepository.findAll();
    }

    /**
     * добавляем новую книгу
     */
    @Override
    public void saveBook(Book book) {
        booksRepository.save(book);
    }

    /**
     * получаем книгу по айди
     */
    @Override
    public Book getBook(int id) {
        Book book = null;
        Optional<Book> optionalBook = booksRepository.findById(id);
        if (optionalBook.isPresent()) {
            book = optionalBook.get();
        }
        return book;
    }

    @Override
    public void deleteBook(int id) {
        booksRepository.deleteById(id);
    }

}
