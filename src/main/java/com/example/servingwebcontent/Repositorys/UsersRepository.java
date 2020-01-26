package com.example.servingwebcontent.Repositorys;


import com.example.servingwebcontent.Models.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UsersRepository extends CrudRepository<User, Integer> {


}
