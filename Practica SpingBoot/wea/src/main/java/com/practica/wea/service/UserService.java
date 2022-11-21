package com.practica.wea.service;

import java.util.List;

import com.practica.wea.model.User;

public interface UserService {
    //el esqueleto de la funcion
    List  < User > getAllUser();

    User getUser(Integer id);

    User save(User user);

    void delete(Integer id);

    //int count();
}
