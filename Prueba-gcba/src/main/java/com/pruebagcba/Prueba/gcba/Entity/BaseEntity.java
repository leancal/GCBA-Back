package com.pruebagcba.Prueba.gcba.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity<T>  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private T id;

    // Getters and Setters
    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

}
