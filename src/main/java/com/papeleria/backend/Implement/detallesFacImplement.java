package com.papeleria.backend.Implement;

import com.papeleria.backend.models.detallesFacModel;
import com.papeleria.backend.repository.detallesFacRepository;
import com.papeleria.backend.services.detallesFacService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class detallesFacImplement implements detallesFacService{

    @Autowired
    detallesFacRepository repo;
    
    @Override
    public List<detallesFacModel> listar() {
        return repo.findAll();
    }

    @Override
    public detallesFacModel registrar(detallesFacModel detallesFac) {
        return repo.save(detallesFac);
    }

    @Override
    public detallesFacModel listarId(Integer codigo) {
        return repo.findById(codigo).orElse(null);
    }
    
    
}

