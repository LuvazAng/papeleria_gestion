package com.papeleria.backend.controller;

import com.papeleria.backend.models.detallesFacModel;
import com.papeleria.backend.models.facturaModel;
import com.papeleria.backend.services.facturaService;
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
@RequestMapping("/factura")
public class facturaController {

    @Autowired
    private facturaService service;
    
    @GetMapping
    public ResponseEntity<List<facturaModel>> listar() {
        List<facturaModel> obj = service.listar();
        return new ResponseEntity<List<facturaModel>>(obj, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> registrar(@RequestBody facturaModel factura) {
        facturaModel obj = service.registrar(factura);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(obj.getIdFacturacion()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<facturaModel> listarPorID(@PathVariable("id") Integer id) throws Exception {
        facturaModel obj = service.listarId(id);
        if (obj == null) {
            throw new Exception("No se encontró cliente");
        }
        return new ResponseEntity<facturaModel>(obj, HttpStatus.OK);
    }
}
