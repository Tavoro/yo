package com.example.servingwebcontent.Repositorys;

import com.example.servingwebcontent.Models.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends CrudRepository<Car, Integer> {

}

