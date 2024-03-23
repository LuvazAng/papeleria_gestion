package com.papeleria.backend.controller;

import com.papeleria.backend.models.facturaModel;
import com.papeleria.backend.services.facturaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factura")
public class facturaController {

    @Autowired
    private facturaService service;
    
    @GetMapping
    public List<facturaModel> listar(){
        return service.listar();
    }
}
