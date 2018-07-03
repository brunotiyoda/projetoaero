/**
 * Entidade responsável por descrever um vôo
 * */
package com.aereo.aereo.model;

import javax.persistence.*;
import java.time.LocalDateTime;
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
    private LocalDateTime dataEHora;

    /**
     * Lê-se N para 1
     * Uma (1) Aeronave pode fazer (N) Vôos
     * Vários (N) Vôos são feitos por uma (1) Aeronave
     * */
    @ManyToOne(fetch = FetchType.EAGER)
    private Aeronave aeronave;

    /**
     * Lê-se 1 para N
     * Um (1) Vôo pode ter vários (N) Passageiros
     * */
    @OneToMany(fetch = FetchType.EAGER)
    private List<Passageiro> passageiros;

    public int getId() {
        return id;
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

    public LocalDateTime getDataEHora() {
        return dataEHora;
    }

    public void setDataEHora(LocalDateTime dataEHora) {
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
