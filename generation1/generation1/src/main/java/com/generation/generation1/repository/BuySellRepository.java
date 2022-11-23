package com.generation.generation1.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.generation.generation1.model.BuySell;

public interface BuySellRepository extends JpaRepository<BuySell,Integer> {
    @Query(value = "SELECT * FROM buy_sell WHERE fecha_compra = ?1 ", nativeQuery = true)
    List<BuySell> findAllFecha(Date fecha);

    @Query(value = "SELECT * FROM buy_sell ", nativeQuery = true)
    List<BuySell> findAllBuysell2();
}
