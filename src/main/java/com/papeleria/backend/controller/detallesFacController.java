package com.papeleria.backend.controller;

import com.papeleria.backend.models.detallesFacModel;
import com.papeleria.backend.services.detallesFacService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detalles")
public class detallesFacController {
    
    @Autowired
    private detallesFacService service;
    
    @GetMapping
    public List<detallesFacModel> listar(){
        return service.listar();
    }
}
