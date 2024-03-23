package com.papeleria.backend.Implement;

import com.papeleria.backend.models.clienteModel;
import com.papeleria.backend.repository.clienteRepository;
import com.papeleria.backend.services.clienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class clienteImplement implements clienteService{

    @Autowired
    clienteRepository repo;
    
    @Override
    public List<clienteModel> listar() {
        return repo.findAll();
    }

    @Override
    public clienteModel registrar(clienteModel cliente) {
        return repo.save(cliente);
    }

    @Override
    public clienteModel actualizar(clienteModel cliente) {
        return repo.save(cliente);
    }

    @Override
    public void eliminar(Integer codigo) {
        repo.deleteById(codigo);
    }

    @Override
    public clienteModel listarId(Integer codigo) {
        return repo.findById(codigo).orElse(null);
    }
    
}
