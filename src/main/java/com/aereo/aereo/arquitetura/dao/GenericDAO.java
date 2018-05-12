package com.aereo.aereo.arquitetura.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
@Transactional
public abstract class GenericDAO<Entidade> {

    private Class<Entidade> entidade;

    @PersistenceContext
    private EntityManager entityManager;

    public Class<Entidade> getEntidade() {
        return entidade;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void salvar(Entidade entidade) {
        getEntityManager().persist(entidade);
    }

    public void editar(Entidade entidade) {
        getEntityManager().merge(entidade);
    }

    public void excluir(Entidade entidade) {
        getEntityManager().remove(getEntityManager().merge(entidade));
    }

    public Entidade buscaPorId(int id) {
        return getEntityManager().find(this.entidade, id);
    }

    public List<Entidade> listaTodos() {
        CriteriaQuery<Entidade> query = entityManager.getCriteriaBuilder().createQuery(entidade);
        query.select(query.from(entidade));

        List<Entidade> lista = entityManager.createQuery(query).getResultList();

        return lista;
    }

}
