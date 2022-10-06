package com.dev.backend.service;

import com.dev.backend.entity.Pessoa;
import com.dev.backend.respository.PessoaRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository PessoaRepository;

    public List<Pessoa> buscarTodos(){
        return PessoaRepository.findAll();
    }

    public Pessoa inserir(Pessoa pessoa){
        pessoa.setDataCriacao((Data) new Date());
        Pessoa pessoaNovo = PessoaRepository.saveAndFlush(pessoa);
        return pessoaNovo;
    }

    public Pessoa alterar(Pessoa objeto){
        objeto.setDataAtualizacao((Data) new Date());
        return PessoaRepository.saveAndFlush(objeto);
    }

    public void excluir(Long id) {
        Pessoa objeto = PessoaRepository.findById(id).get();
        PessoaRepository.delete(objeto);
    }

}
