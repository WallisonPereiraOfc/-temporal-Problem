package com.dev.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;
    @Temporal(TemporalType.DATE)
    private Date dataAtualizacao;

}
