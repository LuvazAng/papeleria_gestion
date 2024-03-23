package com.papeleria.backend.Implement;

import com.papeleria.backend.models.proveedorModel;
import com.papeleria.backend.repository.proveedorRepository;
import com.papeleria.backend.services.proveedorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class proveedorImplement implements proveedorService{

    @Autowired
    proveedorRepository repo;
    
    
    @Override
    public List<proveedorModel> listar() {
        return repo.findAll();
    }

    @Override
    public proveedorModel registrar(proveedorModel proveedor) {
        return repo.save(proveedor);
    }

    @Override
    public proveedorModel actualizar(proveedorModel proveedor) {
        return repo.save(proveedor);
    }

    @Override
    public void eliminar(Integer codigo) {
        repo.deleteById(codigo);
    }

    @Override
    public proveedorModel listarId(Integer codigo) {
        return repo.findById(codigo).orElse(null);
    }
    
    
}
