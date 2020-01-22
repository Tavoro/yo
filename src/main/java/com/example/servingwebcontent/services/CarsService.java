package com.example.servingwebcontent.Services;

import com.example.servingwebcontent.Interfase.CarInterface;
import com.example.servingwebcontent.Models.Car;
import com.example.servingwebcontent.Repositorys.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CarsService implements CarInterface {
    @Autowired
    CarsRepository carsRepository;


    @Override
    public Car PostCar(Car car) {return carsRepository.save(car);}

    @Override
    public ResponseEntity getCars(Integer id) {

        if  (id == null) {
            return ResponseEntity.ok(carsRepository.findAll());
        }
        else {
            return ResponseEntity.ok(carsRepository.findById(id).get());

        }
    }
}
