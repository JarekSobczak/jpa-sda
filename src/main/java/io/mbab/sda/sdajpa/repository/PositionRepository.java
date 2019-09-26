package io.mbab.sda.sdajpa.repository;

import io.mbab.sda.sdajpa.entity.Position;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PositionRepository extends AbstractRepo<Position,Long> {


    public PositionRepository(EntityManager em, Position type) {
        super(em, type);
    }

    @Override
    public List<Position> findAll() {
        return super.findAll();
    }

    @Override
    public Position findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Position create(Position obj) {
        return super.create(obj);
    }

    @Override
    public Position update(Position obj) {
        return super.update(obj);
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }
    //    private EntityManager em;
//
//    public PositionRepository(EntityManager em) {
//        this.em = em;
//    }
//
//    @Override
//    public List<Position> findAll() {
//        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
//        CriteriaQuery<Position> query = criteriaBuilder.createQuery(Position.class);
//        Root<Position> root = query.from(Position.class);
//
//        return em.createQuery(query).getResultList();
//    }
//
//    @Override
//    public Position findById(Long id) {
//        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
//        CriteriaQuery<Position> query = criteriaBuilder.createQuery(Position.class);
//        Root<Position> root = query.from(Position.class);
//
//        return em.createQuery(
//                    query.where(criteriaBuilder.equal(root.get("id"), id)))
//                .getSingleResult();
//    }
//
//    @Override
//    public Position create(Position obj) {
//        em.persist(obj);
//
//        return obj;
//    }
//
//    @Override
//    public Position update(Position obj) {
//        return em.merge(obj);
//    }
//
//    @Override
//    public void delete(Long id) {
//        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
//        CriteriaDelete<Position> deleteQuery = criteriaBuilder.createCriteriaDelete(Position.class);
//        Root<Position> root = deleteQuery.from(Position.class);
//
//        em.createQuery(deleteQuery.where(criteriaBuilder.equal(root.get("id"), id)))
//                .executeUpdate();
//    }
}
