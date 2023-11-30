package com.example.projetose.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetose.entities.Medico;
import com.example.projetose.entities.MedicoEspecialidade;

import java.util.List;

public interface MedicoEspecialidadeRepository extends JpaRepository<MedicoEspecialidade, Integer>{
    List<Medico> getMedicosporEspecialidades (Integer idEspecialidade);
}