package com.example.servingwebcontent.Services;

import com.example.servingwebcontent.Models.User;
import com.example.servingwebcontent.Repositorys.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    public User postUser(User user) {

        return usersRepository.save(user);
    }

    public ResponseEntity delUser( Integer Id){
        usersRepository.deleteById(Id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    public User editUser(User user) {
        return usersRepository.save(user);
    }

    public ResponseEntity getUsers(Integer id) {
        if  (id == null) {
            return ResponseEntity.ok(usersRepository.findAll());
        }
        else {
            return ResponseEntity.ok(usersRepository.findById(id).get());
        }
    }
}


