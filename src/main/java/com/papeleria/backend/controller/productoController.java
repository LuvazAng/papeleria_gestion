package com.papeleria.backend.controller;

import com.papeleria.backend.models.clienteModel;
import com.papeleria.backend.services.productoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.papeleria.backend.models.productoModel;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/productos")
public class productoController {

    @Autowired
    private productoService service;

    /**
     * Endpoint para obtener la lista de todos los clientes.
     *
     * @return ResponseEntity con la lista de clientes y estado HTTP OK.
     */
    @GetMapping
    public ResponseEntity<List<productoModel>> listar() {
        List<productoModel> obj = service.listar();
        return new ResponseEntity<List<productoModel>>(obj, HttpStatus.OK);
    }

    /**
     * Endpoint para registrar un nuevo cliente.
     *
     * @param clienteM Datos del cliente a registrar.
     * @return ResponseEntity con el cliente registrado y estado HTTP OK.
     */
    @PostMapping
    public ResponseEntity<productoModel> registrar(@RequestBody productoModel producto) {
        productoModel obj = service.registrar(producto);
        return new ResponseEntity<productoModel>(obj, HttpStatus.OK);
    }

    /**
     * Endpoint para actualizar los datos de un cliente existente.
     *
     * @param clienteM Datos del cliente a actualizar.
     * @return ResponseEntity con el cliente actualizado y estado HTTP OK.
     */
    @PutMapping
    public ResponseEntity<productoModel> actualizar(@RequestBody productoModel producto) {
        productoModel obj = service.actualizar(producto);
        return new ResponseEntity<productoModel>(obj, HttpStatus.OK);
    }

    /**
     * Endpoint para eliminar un cliente por su ID.
     *
     * @param id ID del cliente a eliminar.
     * @return ResponseEntity con estado HTTP NO_CONTENT en caso de éxito.
     * @throws Exception Si no se encuentra el cliente con el ID proporcionado.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception {
        productoModel obj = service.listarId(id);
        if (obj == null) {
            throw new Exception("No se encontro cliente");
        }
        service.eliminar(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    /**
     * Endpoint para obtener un cliente por su ID.
     *
     * @param id ID del cliente a obtener.
     * @return ResponseEntity con el cliente y estado HTTP OK.
     * @throws Exception Si no se encuentra el cliente con el ID proporcionado.
     */
    @GetMapping("/{id}")
    public ResponseEntity<productoModel> listarPorID(@PathVariable("id") Integer id) throws Exception {
        productoModel obj = service.listarId(id);
        if (obj == null) {
            throw new Exception("No se encontró cliente");
        }
        return new ResponseEntity<productoModel>(obj, HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<productoModel> actualizarParcial(@PathVariable("id") Integer id, @RequestBody Map<String, Object> campos) throws Exception {
        productoModel producto = service.listarId(id);
        if (producto == null) {
            throw new Exception("Producto no encontrado");
        }

        // Actualiza solo los campos proporcionados
        campos.forEach((campo, valor) -> {
            switch (campo) {
                case "nombreProducto":
                    producto.setNombreProducto((String) valor);
                    break;
                case "descripcion":
                    producto.setDescripcion((String) valor);
                    break;
                case "precioUnitario":
                    producto.setPrecioUnitario((Double) valor);
                    break;
                case "stock":
                    producto.setStock((Integer) valor);
                    break;
                // Agrega más casos según los campos que desees permitir actualizar
                default:
                    // Ignora campos desconocidos
                    break;
            }
        });

        productoModel productoActualizado = service.actualizar(producto);
        return new ResponseEntity<>(productoActualizado, HttpStatus.OK);
    }

    @GetMapping("/bajo-stock")
    public ResponseEntity<List<productoModel>> obtenerProductosBajoStock() {
        List<productoModel> productos = service.obtenerProductosBajoStock(5); // Cambia el número según tus necesidades
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }
}
