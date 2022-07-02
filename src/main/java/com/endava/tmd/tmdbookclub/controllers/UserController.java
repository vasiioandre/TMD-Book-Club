package com.endava.tmd.tmdbookclub.controllers;

import com.endava.tmd.tmdbookclub.models.User;
import com.endava.tmd.tmdbookclub.repositories.UserRepository;
import com.endava.tmd.tmdbookclub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;
    //private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(params = "id", method = RequestMethod.GET)
    public User getById(@RequestParam("id") Integer id) {
        return userService.findById(id);
    }


//    @GetMapping
//    public List<User> getAll() {
//        return userRepository.findAll();
//    }
//
//    @GetMapping
//    @RequestMapping("{id}")
//    public User get(@PathVariable Integer id) {
//       return userRepository.findById(id).get();
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public User create(@RequestBody final User user) {
//        return userRepository.saveAndFlush(user);
//    }

}
