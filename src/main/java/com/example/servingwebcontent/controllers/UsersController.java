package com.example.servingwebcontent.controllers;

import com.example.servingwebcontent.models.User;
import com.example.servingwebcontent.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;


    @DeleteMapping
    public  ResponseEntity delUser(@RequestParam  (name = "id") Integer id){
        return usersService.delUser(id);
    }

    @PostMapping
    public User postUser(User user) {
        return usersService.postUser(user);
    }

    @GetMapping
    public ResponseEntity allUsers(@RequestParam(name = "id", required = false) Integer id) {
        return usersService.getUsers(id);
    }


    @PutMapping
    public User editUser(User user) { return usersService.editUser(user); }


}