package com.jeff.cesaspringboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alunos")
public class AlunoController {

    @GetMapping("/listar")
    public String listar(){
        return "aluno/lista";
    }
}
