/**
 * Pela descrição da Arquitetura, o GenericDAO é uma camada de Persistencia, ou seja,
 * inserção de dados e comuniação com o Banco de Dados.
 *
 * O Responsável por ajudar é o Entity Manager.
 * */
package com.aereo.aereo.arquitetura.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

@Repository
@Transactional
public abstract class GenericDAO<Entidade> {

    private Class<Entidade> entidade;

    @PersistenceContext
    private EntityManager entityManager;

    public GenericDAO() {
        Type genericSuperClass = getClass().getGenericSuperclass();

        if (genericSuperClass != null && !(genericSuperClass instanceof Class)) {
            this.entidade = (Class<Entidade>) ((ParameterizedType) genericSuperClass).getActualTypeArguments()[0];
        }
    }


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
