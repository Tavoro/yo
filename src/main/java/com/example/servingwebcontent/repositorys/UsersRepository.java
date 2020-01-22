package com.example.servingwebcontent.Repositorys;

import com.example.servingwebcontent.Models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends CrudRepository<User, Integer> {


    @Query(value = "SELECT * FROM a_user where name = :name", nativeQuery = true) //SQL
    List<User> findByName(@Param("name") String name);

}

