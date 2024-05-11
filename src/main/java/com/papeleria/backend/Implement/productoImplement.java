package com.papeleria.backend.Implement;

import com.papeleria.backend.models.productoModel;
import com.papeleria.backend.repository.productoRepository;
import com.papeleria.backend.services.productoService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productoImplement implements productoService {

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

    @Override
    public productoModel actualizarParcial(Integer id, Map<String, Object> campos) throws Exception {
        productoModel producto = repo.findById(id).orElse(null);
        if (producto == null) {
            throw new Exception("Producto no encontrado");
        }

        campos.forEach((campo, valor) -> {
            switch (campo) {
                case "nombreProducto":
                    producto.setNombreProducto((String) valor);
                    break;
                case "descripcion":
                    producto.setDescripcion((String) valor);
                    break;
                case "precioUnitario":
                    producto.setPrecioUnitario((Double) valor);
                    break;
                case "stock":
                    producto.setStock((Integer) valor);
                    break;
                // Agrega más casos según los campos que desees permitir actualizar
                default:
                    // Ignora campos desconocidos
                    break;
            }
        });

        return repo.save(producto);
    }

    @Override
    public List<productoModel> obtenerProductosBajoStock(Integer cantidad) {
        return repo.findByStockLessThan(cantidad);
    }
}
