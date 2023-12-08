package com.example.projetose.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetose.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
    Usuario findByLogin(String login);

}