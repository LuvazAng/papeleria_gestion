package com.papeleria.backend.controller;

import com.papeleria.backend.models.clienteModel;
import com.papeleria.backend.models.detallesFacModel;
import com.papeleria.backend.services.detallesFacService;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/detalles")
public class detallesFacController {

    @Autowired
    private detallesFacService service;

    @GetMapping
    public ResponseEntity<List<detallesFacModel>> listar() {
        List<detallesFacModel> obj = service.listar();
        return new ResponseEntity<List<detallesFacModel>>(obj, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> registrar(@RequestBody detallesFacModel detalles) {
        detallesFacModel obj = service.registrar(detalles);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{/{id}").buildAndExpand(obj.getIdDetallesFac()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<detallesFacModel> listarPorID(@PathVariable("id") Integer id) throws Exception {
        detallesFacModel obj = service.listarId(id);
        if (obj == null) {
            throw new Exception("No se encontró cliente");
        }
        return new ResponseEntity<detallesFacModel>(obj, HttpStatus.OK);
    }
}
