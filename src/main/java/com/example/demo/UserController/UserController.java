package com.example.demo.UserController;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/users")
    public List<User> list() {
        return userRepository.findAll();
    }
    
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}