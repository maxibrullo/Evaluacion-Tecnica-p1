package com.brullo.maximiliano.Evaluacion.Tecnica.p1.domain;



import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "candidate")

public class Candidate implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long candidateId;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
