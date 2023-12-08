package com.example.projetose.controllers;

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
import com.example.projetose.services.MedicoService;

@RestController
@RequestMapping("/medico")
public class MedicoController {
    
    @Autowired
    MedicoService medicoService;

    @GetMapping("/{idMedico}")
    @Secured(value = { "ROLE_ADMIN", "ROLE_GESTOR" })
    public Medico getMedico(@PathVariable Integer idMedico) {
        return medicoService.getMedico(idMedico);
    }

    @PostMapping
    @Secured(value = { "ROLE_GESTOR" })
    public void cadastrarMedico(@RequestBody Medico medico) {
        medicoService.salvar(medico);
    }

    @PutMapping
    @Secured(value = { "ROLE_GESTOR" })
    public void atualizarMedico(@RequestBody Medico medico) {
        medicoService.salvar(medico);
    }

    @DeleteMapping("/{idMedico}")
    @Secured(value = { "ROLE_GESTOR" })
    public void removerMedico(@PathVariable Integer idMedico) {
        medicoService.remover(idMedico);
    }

}
