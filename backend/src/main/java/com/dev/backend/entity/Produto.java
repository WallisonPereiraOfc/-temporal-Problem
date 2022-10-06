package com.dev.backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String descricaoCurta;
    private String descricaoDetalhada;
    private Double valorCusto;
    private Double valorVenda;
    @ManyToOne
    @JoinColumn(name="idMarca")
    private Marca marca;
    @ManyToOne
    @JoinColumn(name="idCategoria")
    private Categoria categoria;
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;
    @Temporal(TemporalType.DATE)
    private Date dataAtualizacao;
}
