package com.papeleria.backend.controller;

import com.papeleria.backend.models.clienteModel;
import com.papeleria.backend.models.usuarioModel;
import com.papeleria.backend.services.usuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class usuarioController {

    @Autowired
    private usuarioService service;

    /**
     * Endpoint para obtener la lista de todos los clientes.
     *
     * @return ResponseEntity con la lista de clientes y estado HTTP OK.
     */
    @GetMapping
    public ResponseEntity<List<usuarioModel>> listar() {
        List<usuarioModel> obj = service.listar();
        return new ResponseEntity<List<usuarioModel>>(obj, HttpStatus.OK);
    }

    /**
     * Endpoint para registrar un nuevo cliente.
     *
     * @param clienteM Datos del cliente a registrar.
     * @return ResponseEntity con el cliente registrado y estado HTTP OK.
     */
    @PostMapping
    public ResponseEntity<usuarioModel> registrar(@RequestBody usuarioModel usuario) {
        usuarioModel obj = service.registrar(usuario);
        return new ResponseEntity<usuarioModel>(obj, HttpStatus.OK);
    }

    /**
     * Endpoint para actualizar los datos de un cliente existente.
     *
     * @param clienteM Datos del cliente a actualizar.
     * @return ResponseEntity con el cliente actualizado y estado HTTP OK.
     */
    @PutMapping
    public ResponseEntity<usuarioModel> actualizar(@RequestBody usuarioModel usuario) {
        usuarioModel obj = service.actualizar(usuario);
        return new ResponseEntity<usuarioModel>(obj, HttpStatus.OK);
    }

    /**
     * Endpoint para eliminar un cliente por su ID.
     *
     * @param id ID del cliente a eliminar.
     * @return ResponseEntity con estado HTTP NO_CONTENT en caso de éxito.
     * @throws Exception Si no se encuentra el cliente con el ID proporcionado.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception {
        usuarioModel obj = service.listarId(id);
        if (obj == null) {
            throw new Exception("No se encontro cliente");
        }
        service.eliminar(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    /**
     * Endpoint para obtener un cliente por su ID.
     *
     * @param id ID del cliente a obtener.
     * @return ResponseEntity con el cliente y estado HTTP OK.
     * @throws Exception Si no se encuentra el cliente con el ID proporcionado.
     */
    @GetMapping("/{id}")
    public ResponseEntity<usuarioModel> listarPorID(@PathVariable("id") Integer id) throws Exception {
        usuarioModel obj = service.listarId(id);
        if (obj == null) {
            throw new Exception("No se encontró cliente");
        }
        return new ResponseEntity<usuarioModel>(obj, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<usuarioModel> login(@RequestBody usuarioModel usuario) {
        String correo = usuario.getCorreoUsuario();
        String contrasena = usuario.getContrasenaUsuario();
        usuarioModel usuarioAutenticado = service.autenticar(correo, contrasena);
        if (usuarioAutenticado != null) {
            return new ResponseEntity<>(usuarioAutenticado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }
}
