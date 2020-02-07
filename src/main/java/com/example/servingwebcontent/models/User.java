package com.example.servingwebcontent.models;


import lombok.*;

import javax.persistence.*;

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

}
