package com.example.servingwebcontent.Controllers;

import com.example.servingwebcontent.Models.User;
import com.example.servingwebcontent.Repositorys.UsersRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity; ///
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private UsersRepository usersRepository;

    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @PutMapping
    public User editUser( User user) {

        return usersRepository.save(user);
    }

    @DeleteMapping
    public  Integer DelUser(@RequestParam  (name = "id") Integer Id){
        usersRepository.deleteById(Id);
        return Id;
    }

    @GetMapping
    public ResponseEntity allUsers(@RequestParam(name = "id", required = false) Integer id) {

        if  (id == null) {
            return ResponseEntity.ok(usersRepository.findAll());
        }
        else {
            return ResponseEntity.ok(usersRepository.findById(id).get());
        }
    }

    @PostMapping
    public User postUser(User user) {

        return usersRepository.save(user);
    }





}
