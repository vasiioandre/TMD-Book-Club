package com.endava.tmd.tmdbookclub.repositories;

import com.endava.tmd.tmdbookclub.models.Book;
import com.endava.tmd.tmdbookclub.models.BooksAndOwners;
import com.endava.tmd.tmdbookclub.models.BooksAndOwnersI;
import com.endava.tmd.tmdbookclub.models.BooksTitleAndAuthorI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query(value = "SELECT books.title, books.author FROM books", nativeQuery = true)
    List<BooksTitleAndAuthorI> findBooksTitleAndAuthor();

    @Query(value = "SELECT books.title, books.author, users.name, users.surname FROM user_books\n" +
            "INNER JOIN books ON books.id = user_books.book_id\n" +
            "INNER JOIN users ON users.id = user_books.user_id;", nativeQuery = true)
    List<BooksAndOwnersI> findBooksAndOwners();

    @Query(value = "SELECT books.title, books.author, users.name, users.surname\n" +
            "FROM user_books \n" +
            "INNER JOIN books ON books.id = user_books.book_id\n" +
            "INNER JOIN users ON users.id = user_books.user_id\n" +
            "WHERE user_books.id NOT IN (\n" +
            "SELECT user_book_id FROM rentals\n" +
            "    WHERE return_date IS NULL\n" +
            ")", nativeQuery = true)
    List<BooksAndOwnersI> findBooksAvailableForRenting();
}

