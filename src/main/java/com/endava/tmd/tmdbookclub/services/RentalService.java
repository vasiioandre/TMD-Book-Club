package com.endava.tmd.tmdbookclub.services;

import com.endava.tmd.tmdbookclub.models.Rental;
import com.endava.tmd.tmdbookclub.repositories.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalService {
    @Autowired
    private RentalRepository rentalRepository;
    public List<Rental> findAll() {
        return rentalRepository.findAll();
    }
}
