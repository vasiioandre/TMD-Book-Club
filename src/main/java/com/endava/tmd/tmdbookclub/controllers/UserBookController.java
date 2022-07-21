package com.endava.tmd.tmdbookclub.controllers;

import com.endava.tmd.tmdbookclub.models.Rental;
import com.endava.tmd.tmdbookclub.models.UserBook;
import com.endava.tmd.tmdbookclub.services.RentalService;
import com.endava.tmd.tmdbookclub.services.UserBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user_books")
public class UserBookController {
    @Autowired
    private UserBookService userBookService;

    @RequestMapping(method = RequestMethod.GET)
    public List<UserBook> findAll() {
        return userBookService.findAll();
    }
}
