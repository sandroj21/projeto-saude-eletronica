package com.example.projetose.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetose.entities.Especialidade;
import com.example.projetose.entities.Medico;
import com.example.projetose.entities.PostoSaude;

public interface PostoSaudeRepository extends JpaRepository<PostoSaude, Integer>{
    List<PostoSaude> findByEspecialidades(Especialidade especialidade);
}