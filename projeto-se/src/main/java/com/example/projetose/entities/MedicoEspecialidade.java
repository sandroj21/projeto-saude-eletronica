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
@Table(name="medico_especialidade")

//@NamedQuery(name = "MedicoEspecialidade.getMedicosporEspecialidades", query ="SELECT me FROM medico_especialidade me WHERE me.especialidade.id=:idEspecialidade")

public class MedicoEspecialidade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "especialidade_id")
    private Especialidade especialidade;


    

}
