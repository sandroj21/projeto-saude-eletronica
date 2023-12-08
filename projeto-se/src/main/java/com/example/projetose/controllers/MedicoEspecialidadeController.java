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

import com.example.projetose.entities.Medico;
import com.example.projetose.entities.MedicoEspecialidade;
import com.example.projetose.services.MedicoEspecialidadeService;

@RestController
@RequestMapping("/medicosespecialidades")
public class MedicoEspecialidadeController {
    
    @Autowired
    MedicoEspecialidadeService medicoEspecialidadeService;
    
    @GetMapping("/{idEspecialidade}")
    @Secured(value = { "ROLE_ADMIN", "ROLE_GESTOR" })
    public List<Medico> getMedicosPorEspecialidade(@PathVariable Integer idEspecialidade) {
        return medicoEspecialidadeService.getMedicosPorEspecialidade(idEspecialidade);
    }

    @PostMapping
    @Secured(value = { "ROLE_GESTOR" })
    public void salvar(@RequestBody MedicoEspecialidade me) {
        medicoEspecialidadeService.salvar(me);
    }

    @PutMapping
    @Secured(value = { "ROLE_GESTOR" })
    public void atualizar(@RequestBody MedicoEspecialidade me) {
        medicoEspecialidadeService.salvar(me);
    }

    @DeleteMapping("/{idMedicoEspecialidade}")
    @Secured(value = { "ROLE_GESTOR" })
    public void remover(@PathVariable Integer idMedicoEspecialidade) {
        medicoEspecialidadeService.remover(idMedicoEspecialidade);
    }

}
