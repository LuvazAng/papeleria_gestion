package com.papeleria.backend.Implement;

import com.papeleria.backend.models.usuarioModel;
import com.papeleria.backend.repository.usuarioRepository;
import com.papeleria.backend.services.usuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usuarioImplement implements usuarioService {

    @Autowired
    usuarioRepository repo;

    @Override
    public List<usuarioModel> listar() {
        return repo.findAll();
    }

    @Override
    public usuarioModel registrar(usuarioModel usuario) {
        return repo.save(usuario);
    }

    @Override
    public usuarioModel actualizar(usuarioModel usuario) {
        return repo.save(usuario);
    }

    @Override
    public void eliminar(Integer codigo) {
        repo.deleteById(codigo);
    }

    @Override
    public usuarioModel listarId(Integer codigo) {
        return repo.findById(codigo).orElse(null);
    }

}
