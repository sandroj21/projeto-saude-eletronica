package com.example.projetose.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetose.entities.Especialidade;
import com.example.projetose.entities.Medico;


public interface MedicoRepository extends JpaRepository<Medico, Integer> {
    List<Medico> findByEspecialidades(Especialidade especialidade);
}