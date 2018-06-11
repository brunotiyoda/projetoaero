/**
 * Entidade responsável por descrever um vôo
 * */
package com.aereo.aereo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Voo {

    /**
     * Identificador do vôo. Não diz respeito ao NÚMERO do vôo.
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Informa a cidade de Origiem, Partida do Vôo
     * */
    private String cidadeDePartida;

    /**
     * Informa a cidade Destino, Chegada do Võo
     * */
    private String cidadeDeDestino;

    /**
     * Número do Vôo, ex: 4906
     * Gerado automáticamento pelo Generated Value Generation Type = AUTO. Consulte a documentação para mais informações.
     * */
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numeroVoo;

    /**
     * Informa data e hora do Vôo
     *
     * Evolução FUTURA
     * Alterar o campo para LocalDate do Java 8
     * */
    private String dataEHora;

    /**
     * Lê-se N - 1
     * Uma (1) Aeronave pode fazer (N) Vôos
     * */
    @ManyToOne(fetch = FetchType.EAGER)
    private Aeronave aeronave;

    /***/
    @OneToMany(fetch = FetchType.EAGER)
    private List<Passageiro> passageiros;

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

    public String getDataEHora() {
        return dataEHora;
    }

    public void setDataEHora(String dataEHora) {
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
}
