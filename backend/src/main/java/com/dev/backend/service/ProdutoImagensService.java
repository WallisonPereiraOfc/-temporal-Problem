package com.dev.backend.service;

import com.dev.backend.entity.Produto;
import com.dev.backend.entity.ProdutoImagens;
import com.dev.backend.respository.ProdutoImagensRepository;
import com.dev.backend.respository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

@Service
public class ProdutoImagensService {

    @Autowired
    ProdutoImagensRepository produtoImagensRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoImagens> buscartodos(){
        return produtoImagensRepository.findAll();

    }

    //adicionando foto//
    public ProdutoImagens inserir(Long idProduto ,MultipartFile file){
        Produto produto = produtoRepository.findById(idProduto).get();
        ProdutoImagens objeto = new ProdutoImagens();

        //try catch do inserir arquivo//
        try{
            if(!file.isEmpty()){
                byte[] bytes = file.getBytes();
                String nomeImagem = String.valueOf(produto.getId())+ file.getOriginalFilename();
                Path caminho = Paths.
                        get("c:/imagens/" + nomeImagem);
                Files.write(caminho, bytes);
                objeto.setNome(nomeImagem);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        objeto.setProduto(produto);
        objeto.setDataCriacao((Date) new Date());
        objeto = produtoImagensRepository.saveAndFlush(objeto);
        return objeto;
    }

    public ProdutoImagens alterar(ProdutoImagensService objeto){
        return produtoImagensRepository.saveAndFlush(new ProdutoImagens());
    }
    public void excluir(Long id) {
        ProdutoImagens objeto = produtoImagensRepository.findById(id).get();
        produtoImagensRepository.delete(objeto);
    }


}

