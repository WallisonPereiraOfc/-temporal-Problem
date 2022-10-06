package com.dev.backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "pessoa")
@Data
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String endereco;
    private String cep;
    @ManyToOne
    @JoinColumn(name="idCidade")
    private Cidade cidade;

    @Temporal(TemporalType.DATE)
    private Data dataCriacao;

    @Temporal(TemporalType.DATE)
    private Data dataAtualizacao;


}
