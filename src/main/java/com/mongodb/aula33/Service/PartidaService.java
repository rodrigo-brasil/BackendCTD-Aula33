package com.mongodb.aula33.Service;

import com.mongodb.aula33.model.Partida;
import com.mongodb.aula33.model.StatusPartida;
import com.mongodb.aula33.repository.PartidaRepository;
import com.mongodb.aula33.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartidaService {

    @Autowired
    PartidaRepository repository;

    @Autowired
    TimeRepository timeRepository;

    public List<Partida> listar() {
        return repository.findAll();
    }

    public List<Partida> listarAoVivo() {
        return repository.findAll().stream().filter(partida -> partida.getStatus().equals(StatusPartida.AO_VIVO)).collect(Collectors.toList());
    }

    public List<Partida> listarPorStatus(StatusPartida status) {
        return repository.findAllByStatus(status);
    }

    public Partida salvarPartida(Partida partida) {
        timeRepository.save(partida.getLocal());
        timeRepository.save(partida.getVisitante());
        return repository.save(partida);
    }
}
