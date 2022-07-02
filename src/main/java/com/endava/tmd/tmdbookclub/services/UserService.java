package com.endava.tmd.tmdbookclub.services;

import com.endava.tmd.tmdbookclub.models.User;
import com.endava.tmd.tmdbookclub.repositories.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

//    public User findById(Integer id) {
//        return userRepository.findById(id).orElse(null);
//    }
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }


}
