package com.aereo.aereo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Voo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String cidadeDePartida;

    private String cidadeDeDestino;

    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numeroVoo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEHora;

}
