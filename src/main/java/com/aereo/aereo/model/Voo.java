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

    private List<Passageiro> quantidadePassageirosNoVoo = new ArrayList<>();

    @ManyToOne
    private Aeronave aeronave;

    @ManyToMany
    private Passageiro passageiro;


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

    public List<Passageiro> getQuantidadePassageirosNoVoo() {
        return quantidadePassageirosNoVoo;
    }

    public void setQuantidadePassageirosNoVoo(List<Passageiro> quantidadePassageirosNoVoo) {
        this.quantidadePassageirosNoVoo = quantidadePassageirosNoVoo;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
}
