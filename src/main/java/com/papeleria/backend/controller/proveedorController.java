package com.papeleria.backend.controller;

import com.papeleria.backend.models.clienteModel;
import com.papeleria.backend.models.proveedorModel;
import com.papeleria.backend.services.proveedorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proveedores")
public class proveedorController {
    
    @Autowired
    private proveedorService service;
    
/**
     * Endpoint para obtener la lista de todos los clientes.
     *
     * @return ResponseEntity con la lista de clientes y estado HTTP OK.
     */
    @GetMapping
    public ResponseEntity<List<proveedorModel>> listar() {
        List<proveedorModel> obj = service.listar();
        return new ResponseEntity<List<proveedorModel>>(obj, HttpStatus.OK);
    }

    /**
     * Endpoint para registrar un nuevo cliente.
     *
     * @param clienteM Datos del cliente a registrar.
     * @return ResponseEntity con el cliente registrado y estado HTTP OK.
     */
    @PostMapping
    public ResponseEntity<proveedorModel> registrar(@RequestBody proveedorModel proveedor) {
        proveedorModel obj = service.registrar(proveedor);
        return new ResponseEntity<proveedorModel>(obj, HttpStatus.OK);
    }

    /**
     * Endpoint para actualizar los datos de un cliente existente.
     *
     * @param clienteM Datos del cliente a actualizar.
     * @return ResponseEntity con el cliente actualizado y estado HTTP OK.
     */
    @PutMapping
    public ResponseEntity<proveedorModel> actualizar(@RequestBody proveedorModel proveedor) {
        proveedorModel obj = service.actualizar(proveedor);
        return new ResponseEntity<proveedorModel>(obj, HttpStatus.OK);
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
        proveedorModel obj = service.listarId(id);
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
    public ResponseEntity<proveedorModel> listarPorID(@PathVariable("id") Integer id) throws Exception {
        proveedorModel obj = service.listarId(id);
        if (obj == null) {
            throw new Exception("No se encontró cliente");
        }
        return new ResponseEntity<proveedorModel>(obj, HttpStatus.OK);
    }
}
