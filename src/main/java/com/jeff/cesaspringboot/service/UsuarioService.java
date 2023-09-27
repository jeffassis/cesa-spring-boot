package com.jeff.cesaspringboot.service;

import com.jeff.cesaspringboot.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario saveUsuario(Usuario usuario);

    Usuario updateUsuario(Usuario usuario);

    void deleteUsuarioById(Long id);

    Usuario getUsuarioById(Long id);

    List<Usuario> getAllUsuario();
}
