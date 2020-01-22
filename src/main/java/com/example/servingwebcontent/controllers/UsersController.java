package com.example.servingwebcontent.Controllers;

import com.example.servingwebcontent.Models.User;
import com.example.servingwebcontent.Services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Filatov
 * Контроллер Post,Put,Get,Del
 */

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
//        System.out.println(usersService.getUsers2().get(0).getCars().get(0).getMarka());
        return usersService.getUsers(id);}

    @GetMapping("/find")
    public List<User> findByName(@RequestParam(name = "name", required = false) String name){
        return usersService.findByName(name);
    }
    @PutMapping
    public User editUser(User user) { return usersService.editUser(user); }


}   