package com.prueba2.prueba2.service;

import java.util.Map;

import com.prueba2.prueba2.model.User;

public interface UserServiceHashmap {
    //Mostrar hashmap
    Map<Integer,User> getAllMap();
    //agregar
    void addMap(int num , User user);
    //remover
    void removeMap(int num);
    //tamañó  
    int sizeMap();
    //posicion
    User getOneUser(String position);
}