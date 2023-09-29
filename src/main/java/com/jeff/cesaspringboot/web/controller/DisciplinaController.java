package com.jeff.cesaspringboot.web.controller;

import com.jeff.cesaspringboot.model.Disciplina;
import com.jeff.cesaspringboot.service.DisciplinaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/disciplinas")
public class DisciplinaController {
    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping("/listar")
    public String listar(Model model){
        Disciplina disciplina = new Disciplina();
        model.addAttribute("disciplinas", disciplina);
        model.addAttribute("disciplinasTable", disciplinaService.getAllDisciplina());
        return "disciplina/cadastroDisciplina";
    }

    @PostMapping("/salvar")
    public String salvar(@Valid @ModelAttribute("disciplinas") Disciplina disciplina, BindingResult result, Model model){
        if (result.hasErrors()){
            model.addAttribute("disciplinasTable", disciplinaService.getAllDisciplina());
            return "disciplina/cadastroDisciplina";
        }

        disciplinaService.saveDisciplina(disciplina);
        return "redirect:/disciplinas/listar";
    }

    @GetMapping("/editar/{id}")
    public String getDisciplinaEdit(@PathVariable("id") Long id, Model model){
        model.addAttribute("disciplinas", disciplinaService.getDisciplinaById(id));
        model.addAttribute("disciplinasTable", disciplinaService.getAllDisciplina());
        return "disciplina/cadastroDisciplina";
    }

    @PostMapping("/atualizar/{id}")
    public String atualizarDisciplina(@PathVariable("id") Long id, @Valid @ModelAttribute("disciplinas") Disciplina disciplina, BindingResult result){
        if (result.hasErrors()){
            return "disciplina/cadastroDisciplina";
        }

        Disciplina existi = disciplinaService.getDisciplinaById(id);
        existi.setId(id);
        existi.setNome(disciplina.getNome());

        disciplinaService.updateDisciplina(existi);
        return "redirect:/disciplinas/listar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id){
        disciplinaService.deleteDisciplinaById(id);
        return "redirect:/disciplinas/listar";
    }
}
