package com.jeff.cesaspringboot.web.controller;

import com.jeff.cesaspringboot.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        super();
        this.usuarioService = usuarioService;
    }

    @GetMapping("/listar")
    public String listar(){
        return "usuario/lista";
    }

}
