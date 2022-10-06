package com.dev.backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "produto_imagens")
@Data
public class ProdutoImagens {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String nome;
    @ManyToOne
    @JoinColumn(name = "idProduto")
    private Produto produto;
    @Temporal(TemporalType.DATE)
    private Date DataCriacao;
    @Temporal(TemporalType.DATE)
    private Date DataAtualizacao;


}
