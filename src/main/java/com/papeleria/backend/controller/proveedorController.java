package com.papeleria.backend.controller;

import com.papeleria.backend.models.proveedorModel;
import com.papeleria.backend.services.proveedorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proveedores")
public class proveedorController {
    
    @Autowired
    private proveedorService service;
    
    @GetMapping
    public List<proveedorModel> listar(){
        return service.listar();
    }
}
