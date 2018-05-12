package com.aereo.aereo.arquitetura.controller;

import com.aereo.aereo.arquitetura.service.GenericService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public abstract class GenericController<Entidade> {

    public abstract GenericService<Entidade> getGenericService();

    @PostMapping("/salvar")
    public void salvar(Entidade entidade) {
        getGenericService().salvar(entidade);
    }

    @PostMapping
    public void editar(Entidade entidade) {
        getGenericService().editar(entidade);
    }

    @PostMapping("/excluir")
    public void excluir(Entidade entidade) {
        getGenericService().excluir(entidade);
    }

    @PostMapping
    public Entidade buscaPorId(int id) {
        return getGenericService().buscaPorId(id);
    }

    @GetMapping("/listaTodos")
    public List<Entidade> listaTodos() {
        return getGenericService().listaTodos();
    }
}
