package com.aereo.aereo.model;

import javax.persistence.*;

@Entity
public class Funcionario {

    /**
     * Identificador da aeronave
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 185)
    private String nome;

    /**
     * Login do Funcionario
     */
    @Column(nullable = false, length = 16)
    private String cpf;

    /**
     * Senha do Funcionario
     */
    @Column(nullable = false, length = 16)
    private String senha;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
