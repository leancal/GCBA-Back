package com.pruebagcba.Prueba.gcba.Services.Implements;

import com.pruebagcba.Prueba.gcba.Services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class BaseServiceImpl<T, ID> implements BaseService<T, ID> {

    @Autowired
    private JpaRepository<T, ID> repository;

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public T update(ID id, T entity) {
        if (repository.existsById(id)) {
            return repository.save(entity);
        }
        return null;
    }

    @Override
    public boolean delete(ID id) {
        repository.deleteById(id);
        return false;
    }
}
