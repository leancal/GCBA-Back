package com.pruebagcba.Prueba.gcba.Repositories;

import com.pruebagcba.Prueba.gcba.Entity.Producto;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductoRepository extends BaseRepository<Producto, Long> {
}