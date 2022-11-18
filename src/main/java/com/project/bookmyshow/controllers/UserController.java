package com.project.bookmyshow.controllers;

import com.project.bookmyshow.dtos.CreateUserDTO;
import com.project.bookmyshow.models.User;
import com.project.bookmyshow.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    //private final UserService userService;

    @PostMapping("/user")
    public User createUser(@RequestBody CreateUserDTO userRequest) {

        if(userRequest.getEmail() == null) {
            throw new RuntimeException("Invalid request");
        }

        System.out.println("Creating user :"+ userRequest.getEmail());
        return null;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable String id) {
        return null;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return null;
    }

}
