package com.example.projetose.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetose.entities.Medico;
import com.example.projetose.entities.Paciente;
import com.example.projetose.repositories.MedicoRepository;

@Service
public class MedicoService {
    
    @Autowired
    MedicoRepository medicoRepository;

    public Medico getMedico(Integer idMedico) {
        Optional<Medico> medico = medicoRepository.findById(idMedico);
        return medico.get();
    }

    public Medico salvar(Medico medico) {
        return medicoRepository.save(medico);
    }

    public Medico atualizar(Medico medico) {
        return medicoRepository.save(medico);
    }
    
    public void remover(Integer idMedico) {
        medicoRepository.deleteById(idMedico);
    }
}
