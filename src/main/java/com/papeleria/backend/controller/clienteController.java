package com.papeleria.backend.controller;

import com.papeleria.backend.models.clienteModel;
import com.papeleria.backend.services.clienteService;
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
@RequestMapping("/clientes")
public class clienteController {

    @Autowired
    private clienteService service;

    /**
     * Endpoint para obtener la lista de todos los clientes.
     *
     * @return ResponseEntity con la lista de clientes y estado HTTP OK.
     */
    @GetMapping
    public ResponseEntity<List<clienteModel>> listar() {
        List<clienteModel> obj = service.listar();
        return new ResponseEntity<List<clienteModel>>(obj, HttpStatus.OK);
    }

    /**
     * Endpoint para registrar un nuevo cliente.
     *
     * @param clienteM Datos del cliente a registrar.
     * @return ResponseEntity con el cliente registrado y estado HTTP OK.
     */
    @PostMapping
    public ResponseEntity<clienteModel> registrar(@RequestBody clienteModel cliente) {
        clienteModel obj = service.registrar(cliente);
        return new ResponseEntity<clienteModel>(obj, HttpStatus.OK);
    }

    /**
     * Endpoint para actualizar los datos de un cliente existente.
     *
     * @param clienteM Datos del cliente a actualizar.
     * @return ResponseEntity con el cliente actualizado y estado HTTP OK.
     */
    @PutMapping
    public ResponseEntity<clienteModel> actualizar(@RequestBody clienteModel cliente) {
        clienteModel obj = service.actualizar(cliente);
        return new ResponseEntity<clienteModel>(obj, HttpStatus.OK);
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
        clienteModel obj = service.listarId(id);
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
    public ResponseEntity<clienteModel> listarPorID(@PathVariable("id") Integer id) throws Exception {
        clienteModel obj = service.listarId(id);
        if (obj == null) {
            throw new Exception("No se encontró cliente");
        }
        return new ResponseEntity<clienteModel>(obj, HttpStatus.OK);
    }
}
