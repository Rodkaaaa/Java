package com.generation.generation1.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.generation1.model.CarSell;
import com.generation.generation1.repository.CarSellRepositoy;

@Service
@Transactional
public class CarSellService{
    private CarSellRepositoy carSellRepositry;

    public CarSellService(CarSellRepositoy carSellRepositry){
        this.carSellRepositry = carSellRepositry;
    }

    public List<CarSell> findAllCarSell(){
        return (List<CarSell>)carSellRepositry.findAll();
    }
    
    public List<CarSell> findAllCarSell2(){
        return (List<CarSell>)carSellRepositry.findAll();
    }

    public void saveCarSell(CarSell carSell){
        carSellRepositry.save(carSell);
    }

    public void updateCarSell(CarSell carSell){
        carSellRepositry.save(carSell);
    }

    public void deleteCarsell(Integer id){
        carSellRepositry.deleteById(id);
    }

    public List<CarSell> cantidadMayorA(Integer cantidad){
        return carSellRepositry.catidadMayorA(cantidad);
    }

}