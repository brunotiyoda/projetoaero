package com.aereo.aereo.model;

import javax.persistence.*;

@Entity
public class Passageiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 200)
    private String nome;

    @Column(nullable = false, unique = true, length = 18)
    private String documento;

    @Column(nullable = false, length = 200)
    private String email;

    @Column(nullable = false, length = 15)
    private String telefone;

    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numeroPassagem;

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
