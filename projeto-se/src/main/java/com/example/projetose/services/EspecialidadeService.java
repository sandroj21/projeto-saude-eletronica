package com.example.projetose.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetose.entities.Especialidade;
import com.example.projetose.repositories.EspecialidadeRepository;

@Service
public class EspecialidadeService {
    
    @Autowired
    EspecialidadeRepository especialidadeRepository;

    public Especialidade getEspecialidade(Integer idEspecialidade) {
        Optional<Especialidade> especialidade = especialidadeRepository.findById(idEspecialidade);
        return especialidade.get();
    }

    public Especialidade salvar(Especialidade especialidade) {
        return especialidadeRepository.save(especialidade);
    }

    public Especialidade atualizar(Especialidade especialidade) {
        return especialidadeRepository.save(especialidade);
    }
    
    public void remover(Integer idEspecialidade) {
        especialidadeRepository.deleteById(idEspecialidade);
    }
}

