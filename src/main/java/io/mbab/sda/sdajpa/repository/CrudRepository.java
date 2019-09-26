package io.mbab.sda.sdajpa.repository;

import java.util.List;

public interface CrudRepository<T, ID> {

    List<T> findAll();

    T findById(ID id);

    T create(T obj);

    T update(T obj);

    void delete(ID id);
}
