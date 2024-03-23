package com.papeleria.backend.controller;

import com.papeleria.backend.models.usuarioModel;
import com.papeleria.backend.services.usuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class usuarioController {
    @Autowired
    private usuarioService service;
    
    @GetMapping
    public List<usuarioModel> listar(){
        return service.listar();
    }
    
}
