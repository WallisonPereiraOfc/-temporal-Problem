package com.dev.backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "permissao")
public class Permissao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    @Temporal(TemporalType.DATE)
    private Data DataCriacao;
    @Temporal(TemporalType.DATE)
    private Data DataAtulizacao;

}

