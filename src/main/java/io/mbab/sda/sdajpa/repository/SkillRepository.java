package io.mbab.sda.sdajpa.repository;

import io.mbab.sda.sdajpa.entity.Skill;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class SkillRepository extends AbstractRepo<Skill,Long> {


    public SkillRepository(EntityManager em, Skill type) {
        super(em, type);
    }

    @Override
    public List<Skill> findAll() {
        return super.findAll();
    }

    @Override
    public Skill findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Skill create(Skill obj) {
        return super.create(obj);
    }

    @Override
    public Skill update(Skill obj) {
        return super.update(obj);
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }
}
