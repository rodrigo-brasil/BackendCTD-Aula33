package com.mongodb.aula33.controller;

import com.mongodb.aula33.Service.PartidaService;
import com.mongodb.aula33.model.Partida;
import com.mongodb.aula33.model.StatusPartida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidas")
public class PartidaController {

    @Autowired
    PartidaService service;


    @GetMapping
    public List<Partida> listar(){
        return  service.listar();
    }

    @GetMapping("/aovivo")
    public List<Partida> listarAoVivo(){
        return service.listarAoVivo();
    }

    @GetMapping("/aovivo2")
    public List<Partida> listarAoVivo2(){
        return service.listarPorStatus(StatusPartida.AO_VIVO);
    }

    @PostMapping
    public Partida salvar(@RequestBody Partida partida){

        return service.salvarPartida(partida);
    }
}
