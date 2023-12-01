package com.example.projetose.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetose.entities.Consulta;
import com.example.projetose.repositories.ConsultaRepository;

@Service
public class ConsultaService {
    
    @Autowired
    ConsultaRepository consultaRepository;

    public Consulta getConsulta(Integer idConsulta) {
        Optional<Consulta> consulta = consultaRepository.findById(idConsulta);
        Consulta c = consulta.get();
        return consulta.get();
    }

    public Consulta salvar(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    public Consulta atualizar(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    public void remover(Integer idConsulta) {
        consultaRepository.deleteById(idConsulta);
    }

}
