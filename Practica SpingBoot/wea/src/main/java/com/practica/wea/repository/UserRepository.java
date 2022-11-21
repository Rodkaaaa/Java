package com.practica.wea.repository;
import org.springframework.data.repository.CrudRepository;

import com.practica.wea.model.User;

public interface UserRepository extends CrudRepository<User,Integer>{
    
}
