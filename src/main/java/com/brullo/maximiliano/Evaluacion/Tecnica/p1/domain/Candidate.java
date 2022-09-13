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

    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    private Character tipo;
    @NotEmpty
    private Integer documento;

    private String fechaNacimiento;
}
