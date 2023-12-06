package com.example.projetose.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetose.entities.Especialidade;
import com.example.projetose.entities.PostoEspecialidade;
import com.example.projetose.entities.PostoSaude;
import com.example.projetose.repositories.EspecialidadeRepository;
import com.example.projetose.repositories.PostoEspecialidadeRepository;
import com.example.projetose.repositories.PostoSaudeRepository;

@Service
public class PostoEspecialidadeService {
    
    @Autowired
    PostoEspecialidadeRepository postoEspecialidadeRepository;

    @Autowired
    PostoSaudeRepository postoSaudeRepository;

    @Autowired
    EspecialidadeRepository especialidadeRepository;

    public List<PostoSaude> getPostosPorEspecialidade(Integer idEspecialidade) {
        Optional<Especialidade> especialidade = especialidadeRepository.findById(idEspecialidade);

        if (especialidade.isPresent()) {
            Especialidade e = especialidade.get();
            return postoSaudeRepository.findByEspecialidades(e);
        }

        return Collections.emptyList(); 
    }
    
    public PostoEspecialidade salvar(PostoEspecialidade postoEspecialidade) {
        return postoEspecialidadeRepository.save(postoEspecialidade);
    }

    public PostoEspecialidade atualizar(PostoEspecialidade postoEspecialidade) {
        return postoEspecialidadeRepository.save(postoEspecialidade);
    }

    public void remover(Integer idPostoEspecialidade) {
        postoEspecialidadeRepository.deleteById(idPostoEspecialidade);
    }

}
