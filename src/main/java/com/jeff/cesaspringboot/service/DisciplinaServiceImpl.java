package com.jeff.cesaspringboot.service;

import com.jeff.cesaspringboot.model.Disciplina;
import com.jeff.cesaspringboot.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaServiceImpl implements DisciplinaService{
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Override
    public Disciplina saveDisciplina(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    @Override
    public Disciplina updateDisciplina(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    @Override
    public void deleteDisciplinaById(Long id) {
        disciplinaRepository.deleteById(id);
    }

    @Override
    public Disciplina getDisciplinaById(Long id) {
        return disciplinaRepository.findById(id).get();
    }

    @Override
    public List<Disciplina> getAllDisciplina() {
        return disciplinaRepository.findAll();
    }
}
