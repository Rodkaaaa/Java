package com.generation.generation1.repository;

import org.springframework.data.repository.CrudRepository;

import com.generation.generation1.model.User;

public interface UserRepository extends CrudRepository<User,Integer> {
    
}
