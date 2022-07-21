package com.endava.tmd.tmdbookclub.repositories;

import com.endava.tmd.tmdbookclub.models.Rental;
import com.endava.tmd.tmdbookclub.models.UserBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBookRepository extends JpaRepository<UserBook, Integer> {
}
