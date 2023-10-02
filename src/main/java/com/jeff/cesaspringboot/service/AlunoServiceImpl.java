package com.jeff.cesaspringboot.service;

import com.jeff.cesaspringboot.model.Aluno;
import com.jeff.cesaspringboot.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService{
    @Autowired
    private AlunoRepository alunoRepository;
    @Override
    public Aluno saveAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno updateAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public void deleteById(Long id) {
        alunoRepository.deleteById(id);
    }

    @Override
    public Aluno getAlunoById(Long id) {
        return alunoRepository.findById(id).get();
    }

    @Override
    public List<Aluno> getAllAluno() {
        return alunoRepository.findAll();
    }
}
