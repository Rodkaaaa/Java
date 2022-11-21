package com.generation.generation1.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.generation1.model.Car;
import com.generation.generation1.repository.CarRepository;

@Service
@Transactional
public class CarService{

    private CarRepository carRepository;
    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public void saveCar(Car car){
        carRepository.save(car);
    }

    public void updateCar(Car car){
        carRepository.save(car);
    }

    public List<Car> findAll(){
        return (List<Car>)carRepository.findAll();
    }

    public List<Car> bucarPorMarca(String marca){
        return carRepository.findAllCarMarca(marca);
    }

    public List<Car> bucarPorColor(String color){
        return carRepository.findAllCarMarca(color);
    }

    public List<Car> bucarPorColorMarca(String color, String marca){
        return carRepository.findAllCarColorMarca(color, marca);
    }

    public void eliminarAuto(Integer id){
        carRepository.deleteById(id);
    }
    
}