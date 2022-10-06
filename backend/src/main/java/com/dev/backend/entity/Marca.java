package com.dev.backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "marca")
@Data
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    @Temporal(TemporalType.DATE)
    private Data dataCriacao;
    @Temporal(TemporalType.DATE)
    private Data dataAtualizacao;

}
