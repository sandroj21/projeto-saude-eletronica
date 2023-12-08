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
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@NamedQuery(name = "Consulta.getConsultasPorMedico", query ="SELECT c FROM Consulta c WHERE c.medico.id=:idMedico")
@NamedQuery(name = "Consulta.getConsultasPorEspecialidade", query = "SELECT c FROM Consulta c WHERE c.especialidade.id=:idEspecialidade")
public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Date data_consulta;

    @Column
    private boolean retorno;

    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false, updatable = false)
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "especialidade_id", nullable = false, updatable = false)
    private Especialidade especialidade;

}

