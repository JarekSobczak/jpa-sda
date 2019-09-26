package io.mbab.sda.sdajpa.repository;

import io.mbab.sda.sdajpa.entity.Project;
import io.mbab.sda.sdajpa.entity.Skill;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProjectRepository extends AbstractRepo<Project,Long> {


    public ProjectRepository(EntityManager em, Project type) {
        super(em, type);
    }

    @Override
    public List<Project> findAll() {
        return super.findAll();
    }

    @Override
    public Project findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Project create(Project obj) {
        return super.create(obj);
    }

    @Override
    public Project update(Project obj) {
        return super.update(obj);
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }
}
