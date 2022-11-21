package com.generation.generation1.service;

import java.util.ArrayList;
import java.util.List;

import com.generation.generation1.model.User;


public interface UserService{


    
    List  < User > getAllUser();

    User getUser(Integer id);

    User save(User user);

    void delete(Integer id);

    //int count();

}