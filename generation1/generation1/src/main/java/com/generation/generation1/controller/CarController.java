package com.generation.generation1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import com.generation.generation1.model.Car;
import com.generation.generation1.service.CarService;

@RestController
@CrossOrigin("*")
public class CarController {

    private CarService carService;

    public CarController(@Autowired CarService carService ){
        this.carService = carService;
    }

    @PostMapping("/Car/save")
    public void guardarAuto(@RequestBody Car car){
        carService.saveCar(car);
    }

    @PutMapping("/Car/update")
    public void updateAuto(@RequestBody Car car){
        carService.updateCar(car);
    }

    @GetMapping("/Car/findAll")
    public List<Car> todosLosAutos(){
        return carService.findAll();
    }

    @DeleteMapping("/Car/borrar/{id}")
    public void borrarAuto(Integer id){
        carService.eliminarAuto(id);
    }

    @GetMapping("/Car/bucarMarca/{marca}")
    public List<Car> buscarPorMarca(@PathVariable("marca") String marca){
        return carService.bucarPorMarca(marca);
    }

    @GetMapping("/Car/bucarColor/{color}")
    public List<Car> buscaPorColor(@PathVariable("color") String color){
        return carService.bucarPorColor(color);
    }

    @GetMapping("/Car/bucarColorMarca/{color}/{marca}")
    public List<Car> buscaPorColor(@PathVariable("color") String color, @PathVariable("marca") String marca){
        return carService.bucarPorColorMarca(color,marca);
    }


}
