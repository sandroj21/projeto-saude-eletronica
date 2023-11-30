package com.example.projetose.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetose.entities.Paciente;


public interface PacienteRepository extends JpaRepository<Paciente, Integer>{
    
}
