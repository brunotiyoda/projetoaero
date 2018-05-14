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

    private String nomeDaPoltrona;

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

    public int getPoltronasOcupadas() {
        return poltronasOcupadas;
    }

    public void setPoltronasOcupadas(int poltronasOcupadas) {
        this.poltronasOcupadas = poltronasOcupadas;
    }

    public String getNomeDaPoltrona() {
        return nomeDaPoltrona;
    }

    public void setNomeDaPoltrona(String nomeDaPoltrona) {
        this.nomeDaPoltrona = nomeDaPoltrona;
    }
}
