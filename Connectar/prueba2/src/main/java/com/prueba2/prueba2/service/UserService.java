package com.prueba2.prueba2.service;

import java.util.List;
import java.util.Map;

import com.prueba2.prueba2.model.User;
//funciones sin fincionalidad
public interface UserService {
    // esta funcion traera Todos los usuarios que tenga
    List<User> getAll();

    //esta funcion agregar usuarios
    void add(User user);

    //esta funcion removera usuarios
    void remove(User user);

    //obtener tamaño del arreglo
    int size();

    //esta funcion permite obtener un usuario por su posicion
    User getUser(int position);

    //cambiar nombre
    //public void editUser(int position, String name);

    
}
