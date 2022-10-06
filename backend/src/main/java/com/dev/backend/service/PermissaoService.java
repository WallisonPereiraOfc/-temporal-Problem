package com.dev.backend.service;

import com.dev.backend.entity.Permissao;
import com.dev.backend.respository.PermissaoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PermissaoService {


        @Autowired
        private PermissaoRepository permissaoRepository;

        public List<Permissao> buscarTodos() {
            return permissaoRepository.findAll();
        }

        public Permissao inserir(Permissao objeto) {
            objeto.setDataCriacao((Data) new Date());
            Permissao objetoNovo = permissaoRepository.saveAndFlush(objeto);
            return objetoNovo;
        }

        public Permissao alterar(Permissao objeto) {
            objeto.setDataAtulizacao((Data) new Date());
            return permissaoRepository.saveAndFlush(objeto);
        }

        public void excluir(Long id) {
            Permissao objeto = permissaoRepository.findById(id).get();
            permissaoRepository.delete(objeto);
        }
    }


