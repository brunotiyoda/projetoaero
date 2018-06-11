/**
 * Entidade responsável por descrever um Passageiro
 * */
package com.aereo.aereo.model;

import javax.persistence.*;

@Entity
public class Passageiro {

    /**
     * Identificação do Passageiro
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Nome do Passageiro
     * */
    @Column(nullable = false, length = 200)
    private String nome;

    /**
     * Documento do Passageiro
     * Evolução FUTURA
     * Realizar buscas com informações detalhadas do Passageiro atraves do Documento
     * */
    @Column(nullable = false, unique = true, length = 18)
    private String documento;

    /**
     * E-mail do Passageiro
     * Evolução FUTURA
     * Enviar um e-mail de confirmação de Passagem e Dados do Passageiro
     * */
    @Column(nullable = false, length = 200)
    private String email;

    /**
     * Telefone de Contado do Passageiro
     * Evolução FUTURA
     * Enviar um SMS com informções do Vôo, por exemplo.
     * */
    @Column(nullable = false, length = 15)
    private String telefone;

    /**
     * Número da Passagem
     * Gerado automáticamente pelo Generated Value Generation Type = AUTO. Consulte a documentação para mais informações.
     * */
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numeroPassagem;

    /**
     * Lê-se
     * N para 1
     * Vários (N) Võos podem ser feitos por um (1) Passageiro
     * */
    @ManyToOne
    private Voo voo;

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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getNumeroPassagem() {
        return numeroPassagem;
    }

    public void setNumeroPassagem(int numeroPassagem) {
        this.numeroPassagem = numeroPassagem;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }
}
