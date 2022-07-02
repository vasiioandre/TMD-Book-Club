package com.endava.tmd.tmdbookclub.repositories;

import com.endava.tmd.tmdbookclub.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByNameOrEmail(String name, String email);
    //User findUserByNameOrEmail(Optional<String> name, Optional<String> email);

    //How to query for something that doesn't have a method
//    @Query("select u from User u where u.name = :name or u.email = :email")
//    User abc(Optional<String> name, Optional<String> email);
}
