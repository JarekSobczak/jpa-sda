package io.mbab.sda.sdajpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class AbstractRepo<T, ID> implements CrudRepository<T, ID> {

    private EntityManager em;
    private Class<T> type;


    public AbstractRepo(EntityManager em, T type) {
        this.em = em;
        this.type=(Class<T>)type.getClass();
    }

    @Override
    public List<T> findAll() {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(type);
        //Root<T> root = criteriaQuery.from(type);
        return em.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public T findById(ID id) {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(type);
        Root<T> root = query.from(type);

        return em.createQuery(
                query.where(criteriaBuilder.equal(root.get("id"), id)))
                .getSingleResult();
    }

    @Override
    public T create(T obj) {
        em.persist(obj);

        return obj;
    }

    @Override
    public T update(T obj) {
        return em.merge(obj);
    }

    @Override
    public void delete(ID id) {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaDelete<T> deleteQuery = criteriaBuilder.createCriteriaDelete(type);
        Root<T> root = deleteQuery.from(type);

        em.createQuery(deleteQuery.where(criteriaBuilder.equal(root.get("id"), id)))
                .executeUpdate();
    }
}
