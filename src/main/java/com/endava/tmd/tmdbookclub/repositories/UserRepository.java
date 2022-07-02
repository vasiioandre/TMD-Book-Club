package com.endava.tmd.tmdbookclub.repositories;

import com.endava.tmd.tmdbookclub.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
