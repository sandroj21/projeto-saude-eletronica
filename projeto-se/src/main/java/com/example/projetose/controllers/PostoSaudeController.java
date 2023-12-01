package com.example.projetose.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetose.entities.PostoSaude;
import com.example.projetose.services.PostoSaudeService;

@RestController
@RequestMapping("/postosaude")
public class PostoSaudeController {
    
    @Autowired
    PostoSaudeService postoSaudeService;

    @GetMapping("/{idPostoSaude}")
    public PostoSaude getPostoSaude(@PathVariable Integer idPostoSaude) {
        return postoSaudeService.getPostoSaude(idPostoSaude);
    }

    @PostMapping
    public void salvar(@RequestBody PostoSaude postoSaude) {
        postoSaudeService.salvar(postoSaude);
    }

    @PutMapping
    public void atualizar(@RequestBody PostoSaude postoSaude) {
        postoSaudeService.salvar(postoSaude);
    }

    @DeleteMapping("/{idPostoSaude}")
    public void salvar(@PathVariable Integer idPostoSaude) {
        postoSaudeService.remover(idPostoSaude);
    }

    
}
