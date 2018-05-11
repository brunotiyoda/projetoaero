package com.aereo.aereo.model;

import javax.persistence.*;

@Entity
public class Aeronave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 10)
    private String nome;

    @Column(nullable = false)
    private int capacidadePassageiro;


}
