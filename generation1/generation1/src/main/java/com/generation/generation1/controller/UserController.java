package com.generation.generation1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.generation.generation1.model.User;
import com.generation.generation1.service.UserService;

// nos  permite hacer peticiones de cualquier parte
@CrossOrigin("*")
@RestController
public class UserController {

    private UserService userService;

    public UserController( @Autowired UserService userService ){
        this.userService = userService;
    }
    
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable ("id")Integer id){
        return userService.getUser(id);
    }

    @GetMapping("/user")
    public User newUser(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        return userService.save(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        userService.delete(id);
    }

    @GetMapping("/allUser")
    public List <User> getAllUser() {
        return userService.getAllUser() ;
    }
}
