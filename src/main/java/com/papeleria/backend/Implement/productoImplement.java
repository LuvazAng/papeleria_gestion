package com.papeleria.backend.Implement;

import com.papeleria.backend.models.productoModel;
import com.papeleria.backend.repository.productoRepository;
import com.papeleria.backend.services.productoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productoImplement implements productoService{

    @Autowired
    productoRepository repo;
    
    @Override
    public List<productoModel> listar() {
        return repo.findAll();
    }

    @Override
    public productoModel registrar(productoModel producto) {
        return repo.save(producto);
    }

    @Override
    public productoModel actualizar(productoModel producto) {
        return repo.save(producto);
    }

    @Override
    public void eliminar(Integer codigo) {
        repo.deleteById(codigo);
    }

    @Override
    public productoModel listarId(Integer codigo) {
        return repo.findById(codigo).orElse(null);
    }

}
