package com.example.projetose.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetose.entities.Paciente;
import com.example.projetose.repositories.PacienteRepository;

@Service
public class PacienteService {
    
    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente getPaciente(Integer idPaciente) {
        Optional<Paciente> paciente = pacienteRepository.findById(idPaciente);
        return paciente.get();
    }

    public Paciente salvar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public Paciente atualizar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public void remover(Integer idPaciente) {
        pacienteRepository.deleteById(idPaciente);
    }

}
