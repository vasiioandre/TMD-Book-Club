package com.endava.tmd.tmdbookclub.repositories;

import com.endava.tmd.tmdbookclub.models.Book;
import com.endava.tmd.tmdbookclub.models.BooksTitleAndAuthorI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query(value = "SELECT books.title, books.author FROM books", nativeQuery = true)
    List<BooksTitleAndAuthorI> findBooksTitleAndAuthor();
}

