package com.endava.tmd.tmdbookclub.repositories;

import com.endava.tmd.tmdbookclub.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
