package com.example.projetose.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetose.entities.Consulta;
import com.example.projetose.services.ConsultaService;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
    
    @Autowired
    ConsultaService consultaService;

    @GetMapping("/{idConsulta}")
    public Consulta getConsulta(@PathVariable Integer idConsulta) {
        return consultaService.getConsulta(idConsulta);
    }

    @PostMapping
    public void salvar(@RequestBody Consulta consulta) {
        consultaService.salvar(consulta);
    }

    @PutMapping
    public void atualizar(@RequestBody Consulta consulta) {
        consultaService.salvar(consulta);
    }

    @DeleteMapping("/{idConsulta}")
    public void remover(@PathVariable Integer idConsulta) {
        consultaService.remover(idConsulta);
    }
    
    @GetMapping("/medico/{idMedico}")
    public List<Consulta> getConsultasPorMedico(@PathVariable Integer idMedico) {
        List<Consulta> consultas = consultaService.getConsultasPorMedico(idMedico);
        return consultas;
    }

    @GetMapping("/especialidade/{idEspecialidade}")
    public List<Consulta> getConsultasPorEspecialidade(@PathVariable Integer idEspecialidade) {
        List<Consulta> consultas = consultaService.getConsultasPorEspecialidade(idEspecialidade);
        return consultas;
    }
}
