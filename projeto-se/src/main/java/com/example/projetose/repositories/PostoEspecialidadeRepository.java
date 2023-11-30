package com.example.projetose.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetose.entities.PostoEspecialidade;
import com.example.projetose.entities.PostoSaude;

import java.util.List;

public interface PostoEspecialidadeRepository extends JpaRepository<PostoEspecialidade, Integer>{
    List<PostoSaude> getPostosporEspecialidade (Integer idEspecialidade);
}
