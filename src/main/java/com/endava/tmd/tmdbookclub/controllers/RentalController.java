package com.endava.tmd.tmdbookclub.controllers;

import com.endava.tmd.tmdbookclub.models.Rental;
import com.endava.tmd.tmdbookclub.models.User;
import com.endava.tmd.tmdbookclub.services.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rentals")
public class RentalController {
    @Autowired
    private RentalService rentalService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Rental> findAll() {
        return rentalService.findAll();
    }
}
