package com.example.servingwebcontent.Repositorys;


import com.example.servingwebcontent.Models.User;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersRepository extends CrudRepository<User, Integer> {
    List<User> findAll();

}
