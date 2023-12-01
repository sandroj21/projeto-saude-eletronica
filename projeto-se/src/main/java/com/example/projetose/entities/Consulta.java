package com.example.projetose.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
//@NamedQuery(name = "Consulta.getConsultaPorMedico", query ="SELECT c FROM consulta c WHERE c.medico.id=:idMedico")

public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Date data_consulta;

    @Column
    private boolean retorno;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;


    @OneToOne
    private Especialidade especialidade;

}

