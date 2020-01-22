package com.example.servingwebcontent.Interfase;

import com.example.servingwebcontent.Models.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserInterface {

    User postUser();

    ResponseEntity delUser();

    User editUser();

    ResponseEntity getUsers();

    ResponseEntity getUsers2();

     List<User> findByName();

}
