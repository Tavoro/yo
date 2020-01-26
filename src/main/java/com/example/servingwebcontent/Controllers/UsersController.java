package com.example.servingwebcontent.Controllers;

import com.example.servingwebcontent.Models.User;
import com.example.servingwebcontent.Repositorys.UsersRepository;
import com.example.servingwebcontent.Services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

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
    public User editUser(User user) {
        return usersService.editUser(user);
    }


}