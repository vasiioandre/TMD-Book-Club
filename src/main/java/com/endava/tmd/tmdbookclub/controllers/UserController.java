package com.endava.tmd.tmdbookclub.controllers;

import com.endava.tmd.tmdbookclub.models.User;
import com.endava.tmd.tmdbookclub.repositories.UserRepository;
import com.endava.tmd.tmdbookclub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll() {
        return userService.findAll();
    }

//    @RequestMapping(params = "id", method = RequestMethod.GET)
//    public User getById(@RequestParam("id") Integer id) {
//        return userService.findById(id);
//    }

    @RequestMapping(params = "id", method = RequestMethod.GET)
    public Object getById(@RequestParam("id") Integer id) {
        return userService.findById(id).isPresent()? userService.findById(id).get() :
                new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(value = "NameOrEmail", method = RequestMethod.GET)
    public User findNameByNameOrEmail(@RequestParam(value = "name", required = false) String name,
                                      @RequestParam(value = "email", required = false) String email) {
        return userRepository.findUserByNameOrEmail(name, email);
    }

// Alternate method to search for NameOr email, in this case you need to have optional fields into the UserRepository
//    @RequestMapping(value = "NameOrEmail", method = RequestMethod.GET)
//    public User getNameByNameOrEmail(@RequestParam(value = "name") Optional<String> name,
//                                     @RequestParam(value="email") Optional<String> email) {
//        return userRepository.findUserByNameOrEmail(name, email);
//    }

//    @RequestMapping(value = "NameOrEmailWithQuery", method = RequestMethod.GET)
//    public User abc(@RequestParam(value = "name") Optional<String> name,
//                                         @RequestParam(value = "email") Optional<String> email) {
//        return userRepository.abc(name, email);
//    }


// This are the GET commands when you are using directly the Repository, without the userService
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
