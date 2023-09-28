package com.jeff.cesaspringboot.web.controller;

import com.jeff.cesaspringboot.model.Usuario;
import com.jeff.cesaspringboot.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        super();
        this.usuarioService = usuarioService;
    }

    @GetMapping("/listar")
    public String listar(Model model){
        model.addAttribute("usuarios", usuarioService.getAllUsuario());
        return "usuario/lista";
    }

    @GetMapping("/cadastrar")
    public String cadastrar(Model model){
        Usuario usuario = new Usuario();
        model.addAttribute("usuarios", usuario);
        return "usuario/cadastro";
    }

    @PostMapping("/salvar")
    public String salvar(@Valid @ModelAttribute("usuarios") Usuario usuario, BindingResult result){
        if (result.hasErrors()){
            return "usuario/cadastro";
        }

        usuarioService.saveUsuario(usuario);
        return "redirect:/usuarios/listar";
    }

    @GetMapping("/editar/{id}")
    public String getUsuarioParaEditar(@PathVariable("id") Long id, Model model){
        model.addAttribute("usuarios", usuarioService.getUsuarioById(id));
        return "usuario/editar";
    }

    @PostMapping("/atualiza/{id}")
    public String atualizaUsuario(@PathVariable Long id, @Valid @ModelAttribute("usuarios") Usuario usuario, BindingResult result){
        if (result.hasErrors()){
            return "usuario/editar";
        }

        Usuario existi = usuarioService.getUsuarioById(id);
        existi.setId(id);
        existi.setNome(usuario.getNome());
        existi.setUsername(usuario.getUsername());
        existi.setSenha(usuario.getSenha());
        existi.setTipo(usuario.getTipo());

        usuarioService.updateUsuario(existi);
        return "redirect:/usuarios/listar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id){
        usuarioService.deleteUsuarioById(id);
        return "redirect:/usuarios/listar";
    }
}
