package com.example.projetose.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetose.entities.PostoEspecialidade;
import com.example.projetose.entities.PostoSaude;
import com.example.projetose.services.PostoEspecialidadeService;

@RestController
@RequestMapping("/postosespecialidades")
public class PostoEspecialidadeController {
    
    @Autowired
    PostoEspecialidadeService postoEspecialidadeService;
    
    @GetMapping("/{idEspecialidade}")
    @Secured(value = { "ROLE_ADMIN", "ROLE_GESTOR" })
    public List<PostoSaude> getPostosPorEspecialidade(@PathVariable Integer idEspecialidade) {
        return postoEspecialidadeService.getPostosPorEspecialidade(idEspecialidade);
    }

    @PostMapping
    @Secured(value = { "ROLE_GESTOR" })
    public void salvar(@RequestBody PostoEspecialidade pe) {
        postoEspecialidadeService.salvar(pe);
    }

    @PutMapping
    @Secured(value = { "ROLE_GESTOR" })
    public void atualizar(@RequestBody PostoEspecialidade pe) {
        postoEspecialidadeService.salvar(pe);
    }

    @DeleteMapping("/{idMedicoEspecialidade}")
    @Secured(value = { "ROLE_GESTOR" })
    public void remover(@PathVariable Integer idPostoEspecialidade) {
        postoEspecialidadeService.remover(idPostoEspecialidade);
    }

}
