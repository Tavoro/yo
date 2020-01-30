package com.example.servingwebcontent.services;

import com.example.servingwebcontent.models.User;
import com.example.servingwebcontent.repositorys.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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


    public User editUser(Integer id,String name,String pass,User user) {
        user = usersRepository.findById(id).get();

        if (name!=null&&pass!=null) {
            user.setName(name);
            user.setPass(pass);
        }
        else if(name!=null||pass==null){
            user.setName(name);
        }
        else if(pass!=null||name==null)
            user.setPass(pass);

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


