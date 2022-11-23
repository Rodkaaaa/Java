package com.generation.generation1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.generation1.model.CarSell;
import com.generation.generation1.model.User;
import com.generation.generation1.service.CarSellService;

@RestController
@CrossOrigin("*")
public class CarSellController {

    private CarSellService carSellService;

    public CarSellController(@Autowired CarSellService carSellService) {
        this.carSellService = carSellService;
    }

    @GetMapping("/CarSell/findAll")
    public List<CarSell> findAll() {
        return carSellService.findAllCarSell();
    }

    @PostMapping("/CarSell/save")
    public void carSellSave(@RequestBody CarSell carSell) {
        carSellService.saveCarSell(carSell);
    }

    @PutMapping("/CarSell/update")
    public void carSellUpdate(@RequestBody CarSell carSell) {
        carSellService.saveCarSell(carSell);
    }

    @DeleteMapping("/CarSell/delete/{id}")
    public void CarSellDelete(@PathVariable("id") Integer id){
        carSellService.deleteCarsell(id);
    }

    @GetMapping("/CarSell/mayora/{cantidad}")
    public List<CarSell> mayorA(@PathVariable("cantidad") Integer cantidad){
        return carSellService.cantidadMayorA(cantidad);
    }
}
