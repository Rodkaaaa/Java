package com.generation.generation1.service;

import com.generation.generation1.model.User;

public interface UserService{

    User getUser(Integer id);

    User save(User user);

    void delete(Integer id);
}