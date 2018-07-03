/**
 * Entidade responsável por descrever uma aeronave (avião)
 * */
package com.aereo.aereo.model;

import javax.persistence.*;

@Entity
public class Aeronave {

    /**
     * Identificador da aeronave
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Nome, apelido da aeronave
     * */
    @Column(nullable = false, length = 10)
    private String nome;

    /**
     * Campo que informa a quantidade, capacidade de passageiros na aeronave
     * */
    @Column(nullable = false)
    private int capacidadePassageiro;

    /**
     * Evolução FUTURA
     * Campo que informa a quantidade de poltronas vagas na aeronave
     * */
    private int poltronasVagas;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidadePassageiro() {
        return capacidadePassageiro;
    }

    public void setCapacidadePassageiro(int capacidadePassageiro) {
        this.capacidadePassageiro = capacidadePassageiro;
    }

    public int getPoltronasVagas() {
        return poltronasVagas;
    }

    public void setPoltronasVagas(int poltronasVagas) {
        this.poltronasVagas = poltronasVagas;
    }

}
