package com.example.servingwebcontent.Controllers;


import com.example.servingwebcontent.Interfase.CarInterface;
import com.example.servingwebcontent.Models.Car;
import com.example.servingwebcontent.Services.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarInterface carInterface;


    @PostMapping
    public Car postUser(Car car) {
        return carInterface.PostCar(car);
    }

    @GetMapping
    public ResponseEntity allUsers(@RequestParam(name = "id", required = false) Integer id) {
        return carInterface.getCars(id);}
}




