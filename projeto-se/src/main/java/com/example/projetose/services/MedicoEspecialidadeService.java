package com.example.projetose.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.projetose.entities.Especialidade;
import com.example.projetose.entities.Medico;
import com.example.projetose.entities.MedicoEspecialidade;
import com.example.projetose.repositories.EspecialidadeRepository;
import com.example.projetose.repositories.MedicoEspecialidadeRepository;
import com.example.projetose.repositories.MedicoRepository;

@Service
public class MedicoEspecialidadeService {
    
    @Autowired
    MedicoEspecialidadeRepository medicoEspecialidadeRepository;

    @Autowired
    MedicoRepository medicoRepository;

    @Autowired
    EspecialidadeRepository especialidadeRepository;

    public List<Medico> getMedicosPorEspecialidade(Integer idEspecialidade) {
        Optional<Especialidade> especialidade = especialidadeRepository.findById(idEspecialidade);

        if (especialidade.isPresent()) {
            Especialidade e = especialidade.get();
            return medicoRepository.findByEspecialidades(e);
        }

        return Collections.emptyList();
    }
    
    public MedicoEspecialidade salvar(MedicoEspecialidade medicoEspecialidade) {
        return medicoEspecialidadeRepository.save(medicoEspecialidade);
    }

    public MedicoEspecialidade atualizar(MedicoEspecialidade medicoEspecialidade) {
        return medicoEspecialidadeRepository.save(medicoEspecialidade);
    }

    public void remover(Integer idMedicoEspecialidade) {
        medicoEspecialidadeRepository.deleteById(idMedicoEspecialidade);
    }

}
