package com.aereo.aereo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @ManyToOne
    private Aeronave aeronave;

    @ManyToMany
    private List<Passageiro> passageiros;

    @ManyToMany
    private List<Conexao> conexoes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCidadeDePartida() {
        return cidadeDePartida;
    }

    public void setCidadeDePartida(String cidadeDePartida) {
        this.cidadeDePartida = cidadeDePartida;
    }

    public String getCidadeDeDestino() {
        return cidadeDeDestino;
    }

    public void setCidadeDeDestino(String cidadeDeDestino) {
        this.cidadeDeDestino = cidadeDeDestino;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public Date getDataEHora() {
        return dataEHora;
    }

    public void setDataEHora(Date dataEHora) {
        this.dataEHora = dataEHora;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public List<Conexao> getConexoes() {
        return conexoes;
    }

    public void setConexoes(List<Conexao> conexoes) {
        this.conexoes = conexoes;
    }
}
