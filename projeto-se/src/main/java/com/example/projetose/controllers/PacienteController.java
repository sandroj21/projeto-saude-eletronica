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

import com.example.projetose.entities.Paciente;
import com.example.projetose.services.PacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    
    @Autowired
    PacienteService pacienteService;
    
    @GetMapping("/{idPaciente}")
    @Secured(value = { "ROLE_ADMIN", "ROLE_GESTOR" })
    public Paciente getPaciente(@PathVariable Integer idPaciente) {
        return pacienteService.getPaciente(idPaciente);
    }

    @PostMapping
    @Secured(value = { "ROLE_GESTOR" })
    public void cadastrarPaciente(@RequestBody Paciente paciente) {
        pacienteService.salvar(paciente);
    }

    @PutMapping
    @Secured(value = { "ROLE_GESTOR" })
    public void atualizarPaciente(@RequestBody Paciente paciente) {
        pacienteService.atualizar(paciente);
    }

    @DeleteMapping("/{idPaciente}")
    @Secured(value = { "ROLE_GESTOR" })
    public void removerPaciente(@PathVariable Integer idPaciente) {
        pacienteService.remover(idPaciente);
    }

}
