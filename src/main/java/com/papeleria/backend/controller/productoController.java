
package com.papeleria.backend.controller;

import com.papeleria.backend.services.productoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.papeleria.backend.models.productoModel;


@RestController
@RequestMapping("/productos")
public class productoController {
    
    @Autowired
    private productoService service;
    
    @GetMapping
    public List<productoModel> listar(){
        return service.listar();
    }
}
