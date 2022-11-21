package com.generation.generation1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.generation.generation1.model.License;



public interface LicenseRepository extends CrudRepository<License, Integer>{

    @Query(value = "SELECT * FROM license WHERE clase = ?1", nativeQuery = true)
    List<License> FindAllClase(String clase);

    @Query(value = "SELECT * FROM license WHERE estado = ?1", nativeQuery = true)
    List<License> findAllestado(String estado);

    @Query(value = "SELECT * FROM license l JOIN l.user u", nativeQuery = true)
    List<License> BuscarLicensiasUsuarios();

    
}
