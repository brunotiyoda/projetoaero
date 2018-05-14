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

    private int poltronasVagas;

    private int poltronasOcupadas;

    public Aeronave() {
    }

    public Aeronave(String nome, int capacidadePassageiro, int poltronasVagas, int poltronasOcupadas) {
        this.nome = nome;
        this.capacidadePassageiro = capacidadePassageiro;
        this.poltronasVagas = poltronasVagas;
        this.poltronasOcupadas = poltronasOcupadas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int poltronasOcupadas() {
        return poltronasOcupadas;
    }

    public void poltronasOcupadas(int poltronasOcupadas) {
        this.poltronasOcupadas = poltronasOcupadas;
    }
}
