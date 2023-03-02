package com.example.demo;

import com.example.demo.entity.CarEntity;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/all")
    public Iterable <CarEntity> getAll(){
        return carService.findAll();
    }

    @GetMapping
    public Optional<CarEntity>getById(@RequestParam Integer temp){
        return carService.findById(temp);
    }

    @DeleteMapping
    public void deleteBy(@RequestParam Integer temp){
        carService.deletyById(temp);
    }

    @PostMapping
    public CarEntity addCar(@RequestBody CarEntity carEntity){
        return carService.save(carEntity);
    }

    @PutMapping
    public CarEntity editCar(@RequestBody CarEntity carEntity){
        return carService.save(carEntity);
    }

}
