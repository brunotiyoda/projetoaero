package com.aereo.aereo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conexao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String cidadeConexao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCidadeConexao() {
        return cidadeConexao;
    }

    public void setCidadeConexao(String cidadeConexao) {
        this.cidadeConexao = cidadeConexao;
    }
}
