package com.example.servingwebcontent.Models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity

@Table(name = "a_car")

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "marka")
    private String marka;

    @Column(name = "nomer")
    private Integer nomer;

    @JsonBackReference
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "cars")
    private List<User> users = new ArrayList<>();






}
