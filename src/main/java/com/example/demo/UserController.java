package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private UsuarioJpa usuarioJpa;

    @PostMapping(path = "/usuario")
    public String guardarUsuario(@RequestBody Usuario usuario) {
        usuarioJpa.save(usuario);
        return "Usuario guardado";
    }

    @GetMapping("/usuarios")
    public List<Usuario> consultarUsuario() {
        return usuarioJpa.findAll();
    }
}
