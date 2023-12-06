package com.example.projetose.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter

//@NamedQuery(name = "PostoEspecialiade.getPostosporEspecialidade", query ="SELECT pe FROM posto_especialidade pe WHERE pe.especialidade.id=:idEspecialidade")

public class PostoEspecialidade{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "posto_id")
    private PostoSaude posto;

    @ManyToOne
    @JoinColumn(name = "especialidade_id")
    private Especialidade especialidade;


    

}
