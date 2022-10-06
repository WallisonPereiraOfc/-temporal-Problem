package com.dev.backend.service;

import com.dev.backend.entity.Categoria;
import com.dev.backend.entity.Cidade;
import com.dev.backend.respository.CategoriaRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public List<Categoria> buscartodos(){
        return categoriaRepository.findAll();

    }

    public Categoria inserir(Categoria categoria){
        categoria.setDataCriacao((Data) new Date());
        Categoria categoriaNovo = categoriaRepository.saveAndFlush(categoria);
        return categoriaNovo;
    }

    public Categoria alterar(Categoria objeto){
        objeto.setDataAtualizacao(new Date());
        return categoriaRepository.saveAndFlush(objeto);
    }
    public void excluir(Long id) {
        Categoria objeto = categoriaRepository.findById(id).get();
        categoriaRepository.delete(objeto);
    }
}

