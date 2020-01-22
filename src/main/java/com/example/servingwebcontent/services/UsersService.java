package com.example.servingwebcontent.Services;

import com.example.servingwebcontent.Interfase.UserInterface;
import com.example.servingwebcontent.Models.User;
import com.example.servingwebcontent.Repositorys.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService  {
    @Autowired
    private UsersRepository usersRepository;


    /**
     *  Post запрос.
     *  Добавляет юзера.
     * @param user обЪект.
     * @return запись обЪекта.
     */

    public User postUser(User user) {return usersRepository.save(user);}

    /**
     *  Del запрос.
     *  Удаление юзера.
     * @param Id номер юзера в базе данных.
     * @return возвращает статус 200.
     */

    public ResponseEntity delUser(Integer Id){
        usersRepository.deleteById(Id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    /**
     * Put запрос.
     * Редактирует юзера.
     * @param user обЪект.
     * @return
     */


    public User editUser(User user) {return usersRepository.save(user);}

    /**
     * Get запрос.
     * Берет юзера или юзеров в зависимости от параметра id.
     * @param id
     * @return возвращает юзера или юзеров
     */

    public ResponseEntity getUsers(Integer id) {
        if  (id == null) {
            return ResponseEntity.ok(usersRepository.findAll());
        }
        else {
            return ResponseEntity.ok(usersRepository.findById(id).get());

        }
    }

    public List<User> getUsers2() {
        List<User> result = new ArrayList<>();
        usersRepository.findAll().forEach(result::add);
         return result;
        }


    public List<User> findByName(String s){
        return usersRepository.findByName(s);
    }

}







