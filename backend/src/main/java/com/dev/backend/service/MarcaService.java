package com.dev.backend.service;

import com.dev.backend.entity.Marca;
import com.dev.backend.respository.MarcaRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class MarcaService {


    @Autowired
    static
    MarcaRepository marcaRepository;

    public static List<Marca> buscarTodos(){
        return marcaRepository.findAll();
    }

    public static Marca inserir(Marca marca){
        marca.setDataCriacao((Data) new Date());
        Marca marcaNovo = (Marca) marcaRepository.saveAndFlush(marca);
        return marcaNovo;
    }

    public static Marca alterar(Marca objeto) {
        objeto.setDataAtualizacao((Data) new Date());
        return (Marca) marcaRepository.saveAndFlush(objeto);
    }

    public static void excluir(Long id) {
        Marca objeto = (Marca) marcaRepository.findById(id).get();
        marcaRepository.delete(objeto);
    }
}
