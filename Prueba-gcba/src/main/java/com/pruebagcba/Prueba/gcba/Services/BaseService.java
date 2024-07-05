package com.pruebagcba.Prueba.gcba.Services;


import java.util.List;
import java.util.Optional;

public interface BaseService<T, ID> {
    List<T> findAll();
    Optional<T> findById(ID id);
    T save(T entity);
    T update(ID id, T entity);
    boolean delete(ID id);
}