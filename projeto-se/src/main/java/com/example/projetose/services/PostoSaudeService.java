package com.example.projetose.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetose.entities.PostoSaude;
import com.example.projetose.repositories.PostoSaudeRepository;

@Service
public class PostoSaudeService {

    @Autowired
    PostoSaudeRepository postoSaudeRepository;

    public PostoSaude getPostoSaude(Integer idPostoSaude) {
        Optional<PostoSaude> postoSaude = postoSaudeRepository.findById(idPostoSaude);
        return postoSaude.get();
    }

    public PostoSaude salvar(PostoSaude postoSaude) {
        return postoSaudeRepository.save(postoSaude);
    }

    public PostoSaude atualizar(PostoSaude postoSaude) {
        return postoSaudeRepository.save(postoSaude);
    }
    
    public void remover(Integer idPostoSaude) {
        postoSaudeRepository.deleteById(idPostoSaude);
    }
}
