package com.jeff.cesaspringboot.service;

import com.jeff.cesaspringboot.model.Aluno;

import java.util.List;

public interface AlunoService {
    Aluno saveAluno(Aluno aluno);

    Aluno updateAluno(Aluno aluno);

    void deleteById(Long id);

    Aluno getAlunoById(Long id);

    List<Aluno> getAllAluno();
}
