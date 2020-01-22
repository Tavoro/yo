package com.example.servingwebcontent.Interfase;

import com.example.servingwebcontent.Models.Car;
import org.springframework.http.ResponseEntity;

public interface CarInterface {

    Car PostCar(Car car);


    ResponseEntity getCars(Integer id);

}
