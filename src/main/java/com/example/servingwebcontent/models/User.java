package com.example.servingwebcontent.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import javax.persistence.*;
import java.util.*;

/**
 * Модель Юзера.
 * Используется Ломбок.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

@Entity

@Table(name = "a_user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "pass")
    private String pass;


    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_car",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "car_id", referencedColumnName = "id")
    )
    private List<Car> cars = new ArrayList<>();





}
