package com.endava.tmd.tmdbookclub.repositories;

import com.endava.tmd.tmdbookclub.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByNameOrEmail(String name, String email);

    //@Query("select u from User u where u.name = :name or u.email = :email")
    @Query(value = "SELECT * FROM users WHERE name = ?1", nativeQuery = true)
    User abc(Optional<String> name, Optional<String> email);
}
