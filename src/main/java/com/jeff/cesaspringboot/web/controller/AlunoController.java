package com.jeff.cesaspringboot.web.controller;

import com.jeff.cesaspringboot.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alunos")
public class AlunoController {

    @GetMapping("/listar")
    public String listar(){
        return "aluno/lista";
    }

    @GetMapping("/cadastrar")
    public String cadastrar(Model model){
        Aluno aluno = new Aluno();
        model.addAttribute("alunos", aluno);
        return "aluno/cadastroAluno";
    }
}
