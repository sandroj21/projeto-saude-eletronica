package com.example.projetose.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetose.entities.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Integer>{
    List<Consulta> getConsultaPorMedico (Integer idMedico);
}