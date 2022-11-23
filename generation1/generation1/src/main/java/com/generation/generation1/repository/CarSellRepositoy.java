package com.generation.generation1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.generation.generation1.model.CarSell;

public interface CarSellRepositoy extends JpaRepository<CarSell, Integer> {
    
    @Query(value= "SELECT * FROM car_sell WHERE cantidad < 1?" , nativeQuery=true )
    List<CarSell> catidadMayorA(Integer cantidad);

    @Query(value = "SELECT * FROM car_sell ", nativeQuery = true)
    List<CarSell> findAllCarSell2();
    
}
