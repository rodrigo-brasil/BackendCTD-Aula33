package com.mongodb.aula33.controller;

import com.mongodb.aula33.Service.TorneioService;
import com.mongodb.aula33.model.Torneio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/torneios")
public class TorneioController {

    @Autowired
    TorneioService service;

    @PostMapping
    public ResponseEntity<Torneio> salvar(@RequestBody Torneio torneio){
        return ResponseEntity.status(HttpStatus.OK).body(service.salvar(torneio));
    }

    @GetMapping
    public List<Torneio> listar(){
        return service.listar();
    }

}
