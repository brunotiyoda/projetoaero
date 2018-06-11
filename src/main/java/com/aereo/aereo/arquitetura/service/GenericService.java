/**
 * Pela descrição da Arquitetura, o GenericService é responsável por ser a camada de regras de negócio
 * */
package com.aereo.aereo.arquitetura.service;

import com.aereo.aereo.arquitetura.dao.GenericDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class GenericService<Entidade> {

    public abstract GenericDAO<Entidade> getGenericDAO();

    public void salvar(Entidade entidade) {
        getGenericDAO().salvar(entidade);
    }

    public void editar(Entidade entidade) {
        getGenericDAO().editar(entidade);
    }

    public void excluir(Entidade entidade) {
        getGenericDAO().excluir(entidade);
    }

    public Entidade buscaPorId(int id) {
        return getGenericDAO().buscaPorId(id);
    }

    public List<Entidade> listaTodos() {
        return getGenericDAO().listaTodos();
    }
}
