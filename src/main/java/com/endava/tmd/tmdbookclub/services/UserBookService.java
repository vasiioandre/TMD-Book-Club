package com.endava.tmd.tmdbookclub.services;

import com.endava.tmd.tmdbookclub.models.UserBook;
import com.endava.tmd.tmdbookclub.repositories.UserBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBookService {
    @Autowired
    private UserBookRepository userBookRepository;

    public List<UserBook> findAll() {
        return userBookRepository.findAll();
    }
}
