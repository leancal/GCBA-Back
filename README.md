# Proyecto de Gestión de Productos con Java y Spring Boot

## Lenguaje y framework
- Java 17 con Spring Boot 3.3.1
- Maven

## EndPoints de la API

### Obtener todos los productos
- **URL:** `http://localhost:8080/productos`
- **Método:** `GET`
- **Respuesta:**
  ```json
  [
      {
          "id": 1,
          "nombre": "producto 1",
          "descripcion": "es el producto 1",
          "precio": 0.1,
          "cantidad": 1
      }
  ]

### Obtener un producto por ID
- **URL:** `http://localhost:8080/productos/{id}`
- **Método:** `GET`
- **Respuesta (Producto encontrado):**
  ```json
  [
      {
          "id": 1,
          "nombre": "producto 1",
          "descripcion": "es el producto 1",
          "precio": 0.1,
          "cantidad": 1
      }
  ]

- **Respuesta (Producto no encontrado):**
   ```json
  [
      {
         "No se encontró el producto"
      }
  ]


### Crear un nuevo producto
- **URL:** `http://localhost:8080/productos/`
- **Método:** `POST`
- **Body:**
  ```json
  [
      {
           "nombre": "Producto 1",
            "descripcion": "Descripción 1",
            "precio": 100.0,
            "cantidad": 10
      }
  ]

- **Respuesta exitosa:**
   ```json
  [
      {
         "Producto creado exitosamente"
      }
  ]

- **Respuesta de error:**
   ```json
  [
      {
         ""No se pudo crear el producto"
      }
  ]


### Actualizar un producto
- **URL:** `http://localhost:8080/productos/{id}`
- **Método:** `PUT`
- **Body:**
  ```json
  [
      {
           "nombre": "producto 1 actualizado",
          "descripcion": "es el producto 1",
          "precio": 100,
          "cantidad": 2
      }
  ]

- **Respuesta (Producto actualizado):**
   ```json
  [
      {
         "id": 1,
          "nombre": "producto 1 actualizado",
          "descripcion": "es el producto 1",
          "precio": 100,
          "cantidad": 2
      }
  ]


### Crear un nuevo producto
- **URL:** `http://localhost:8080/productos/{id}`
- **Método:** `DELETE`
- **Respuesta (Producto eliminado):**
  ```json
  [
      {
           "message": "Producto eliminado exitosamente"
      }
  ]

- **Respuesta (Producto no encontrado):**
   ```json
  [
      {
         "No se encontró el producto con ID {id} para eliminar"
      }
  ]


## EndPoints de la API

 - **Para acceder a la consola H2 y ver la base de datos en memoria:**

      -Acceder a: http://localhost:8080/h2-console
      -Configuración de conexión:
         - JDBC URL: jdbc:h2:mem:testdb
         - User Name: usuario
         - Password: 123456789



