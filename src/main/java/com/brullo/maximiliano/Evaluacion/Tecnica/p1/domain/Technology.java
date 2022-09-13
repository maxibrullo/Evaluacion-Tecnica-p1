package com.brullo.maximiliano.Evaluacion.Tecnica.p1.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "technology")

public class Technology implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long technologyId;
    private String nombre;
    private String version;

}
