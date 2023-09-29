package com.jeff.cesaspringboot.web.controller;

import com.jeff.cesaspringboot.model.Disciplina;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @GetMapping("/listar")
    public String listar(Model model){
        Disciplina disciplina = new Disciplina();
        model.addAttribute("disciplinas", disciplina);
        return "disciplina/cadastroDisciplina";
    }
}
