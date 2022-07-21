package com.endava.tmd.tmdbookclub.repositories;

import com.endava.tmd.tmdbookclub.models.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Integer> {

}
