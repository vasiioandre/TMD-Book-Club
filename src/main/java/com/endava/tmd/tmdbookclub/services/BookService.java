package com.endava.tmd.tmdbookclub.services;

import com.endava.tmd.tmdbookclub.models.Book;
import com.endava.tmd.tmdbookclub.models.User;
import com.endava.tmd.tmdbookclub.repositories.BookRepository;
import com.endava.tmd.tmdbookclub.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private UserRepository userRepository;


    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public Book addBookToUser(Integer bookId, Integer userId) {
        Book book = bookRepository.findById(bookId).get();
        User user = userRepository.findById(userId).get();
        user.addBook(book);

        return bookRepository.save(book);
    }
}
