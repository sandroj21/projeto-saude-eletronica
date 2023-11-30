package com.example.projetose.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PacienteController {
    
    @GetMapping("/")
    public String index() {
        return "Olá, esta é uma requisicao teste para o GET Paciente";
    }
}
