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
    private String documento;

    /**
     * Senha do Funcionario
     */
    @Column(nullable = false, length = 16)
    private String senha;

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
