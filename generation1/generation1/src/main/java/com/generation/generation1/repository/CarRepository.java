package com.generation.generation1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;

import com.generation.generation1.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> /* Puede ser JpaRepository */ {
    //aca es para hacer querys 
    //funcion query para buscar autos por marca
    //native queri le decimos a java que estamos usando otro lenguaje y que no es necesario que lo interprete
    @Query(value = "SELECT * FROM car WHERE marca = ?1", nativeQuery = true)
    List<Car> findAllCarMarca(String marca);
    //funcion query para buscar autos por color
    @Query(value = "SELECT * FROM car WHERE color = ?1", nativeQuery = true)
    List<Car> findAllCarColor(String color);
    //por color y marca
    @Query(value = "SELECT * FROM car WHERE color = ?1 AND marca = ?2", nativeQuery = true)
    List<Car> findAllCarColorMarca(String color, String marca);
    //autos vendidos
    @Query(value = "SELECT * FROM car c JOIN c.car_sell cs", nativeQuery = true)
    List<Car> BuscarAutosVendidos();
}
