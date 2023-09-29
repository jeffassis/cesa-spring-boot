package com.jeff.cesaspringboot.service;

import com.jeff.cesaspringboot.model.Disciplina;

import java.util.List;

public interface DisciplinaService {
    Disciplina saveDisciplina(Disciplina disciplina);

    Disciplina updateDisciplina(Disciplina disciplina);

    void deleteDisciplinaById(Long id);

    Disciplina getDisciplinaById(Long id);

    List<Disciplina> getAllDisciplina();
}
