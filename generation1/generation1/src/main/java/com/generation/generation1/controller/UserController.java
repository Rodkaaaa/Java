package com.generation.generation1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.generation1.model.User;
import com.generation.generation1.service.UserService;

// nos  permite hacer peticiones de cualquier parte
@RestController
@CrossOrigin("*")

public class UserController {

    private UserService userService;

    public UserController( @Autowired UserService userService ){
        this.userService = userService;
    }
    
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable ("id")Integer id){
        return userService.getUser(id);
    }

    @PostMapping("/user/save")
    public User newUser(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping("/user/update")
    public User updatUser(@RequestBody User user){
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
