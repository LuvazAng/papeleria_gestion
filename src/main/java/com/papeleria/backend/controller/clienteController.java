package com.papeleria.backend.controller;

import com.papeleria.backend.models.clienteModel;
import com.papeleria.backend.services.clienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class clienteController {

    @Autowired
    private clienteService service;
    
    @GetMapping
    public List<clienteModel> listar(){
        return service.listar();
    }
}
