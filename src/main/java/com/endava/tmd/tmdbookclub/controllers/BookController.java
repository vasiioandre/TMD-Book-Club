package com.endava.tmd.tmdbookclub.controllers;

import com.endava.tmd.tmdbookclub.models.Book;
import com.endava.tmd.tmdbookclub.models.BooksTitleAndAuthorI;
import com.endava.tmd.tmdbookclub.models.User;
import com.endava.tmd.tmdbookclub.repositories.BookRepository;
import com.endava.tmd.tmdbookclub.services.BookService;
import com.endava.tmd.tmdbookclub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    BookRepository bookRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.PUT)
    Book addBookToUser(@RequestParam(value = "bookId") Integer bookId,
                       @RequestParam(value = "userId") Integer userId) {
        return bookService.addBookToUser(bookId, userId);
    }

    @RequestMapping(value = "title-and-author", method = RequestMethod.GET)
    public List<BooksTitleAndAuthorI> findBooksTitleAndAuthor() {
        return bookRepository.findBooksTitleAndAuthor();
    }

}
