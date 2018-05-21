package com.aereo.aereo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conexao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Voo voo;

    private String cidadeConexao;

}
