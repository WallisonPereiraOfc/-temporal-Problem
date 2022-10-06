package com.dev.backend.controller;

import com.dev.backend.entity.Estado;
import com.dev.backend.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(value = "/api/estado")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/")
    private List<Estado> buscarTodos(){
        return estadoService.buscarTodos();
    }

    @PostMapping("/")
    public Estado inserir(@RequestBody Estado estado){
        return estadoService.inserir(estado);
    }

    @PutMapping("/")
    public Estado alterar(@RequestBody Estado estado){return estadoService.alterar(estado);}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        estadoService.excluir(id);
        return ResponseEntity.ok().build();
    }






}
