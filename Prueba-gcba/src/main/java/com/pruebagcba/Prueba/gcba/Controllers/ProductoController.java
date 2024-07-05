package com.pruebagcba.Prueba.gcba.Controllers;

import com.pruebagcba.Prueba.gcba.Entity.Producto;
import com.pruebagcba.Prueba.gcba.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductoById(@PathVariable Long id) {
        Optional<Producto> productoOptional = productoService.findById(id);
        if (productoOptional.isPresent()) {
            Producto producto = productoOptional.get();
            return ResponseEntity.ok(producto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el producto ");
        }
    }


    @PostMapping
    public ResponseEntity<String> createProducto(@RequestBody Producto producto) {
        Producto savedProducto = productoService.save(producto);
        if (savedProducto != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Producto creado exitosamente");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("No se pudo crear el producto");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> updateProducto(@PathVariable Long id, @RequestBody Producto producto) {
        return productoService.update(id, producto) != null ?
                ResponseEntity.ok(producto) : ResponseEntity.notFound().build();
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProducto(@PathVariable Long id) {
        boolean deleted = productoService.delete(id);
        if (deleted) {
            return ResponseEntity.ok("Producto eliminado exitosamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el producto para eliminar");
        }
    }

}
