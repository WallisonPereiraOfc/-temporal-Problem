package com.dev.backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cidade")
@Data
public class Cidade extends Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "idestado")
    private Estado estado;
    private String nome;
    @Temporal(TemporalType.DATE)
    private Data dataCriacao;


}
