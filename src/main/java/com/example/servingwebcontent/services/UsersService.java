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
     * @return возвращает статус 2001111.
     */
    public ResponseEntity delUser( Integer Id){
        usersRepository.deleteById(Id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    /**
     * Put запрос.
     * Редактирует юзера.
     * @param user обЪект.
     * @return Сохраняет обЪект.
     */
    public User editUser(User user) {return usersRepository.save(user);}

    /**
     * Get запрос.
     * Берет юзера или юзеров в зависимости от параметра id.
     * @param id id юзера
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
}







