package com.papeleria.backend.Implement;

import com.papeleria.backend.models.facturaModel;
import com.papeleria.backend.repository.facturaRepository;
import com.papeleria.backend.services.facturaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class facturaImplement implements facturaService{

    @Autowired
    facturaRepository repo;

    @Override
    public List<facturaModel> listar() {
        return repo.findAll();
    }

    @Override
    public facturaModel registrar(facturaModel factura) {
        return repo.save(factura);
    }

    @Override
    public facturaModel listarId(Integer codigo) {
        return repo.findById(codigo).orElse(null);
    }
    
}
