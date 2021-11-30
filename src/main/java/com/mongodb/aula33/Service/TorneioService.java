package com.mongodb.aula33.Service;

import com.mongodb.aula33.model.Torneio;
import com.mongodb.aula33.repository.TorneioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TorneioService {

    @Autowired
    private TorneioRepository repository;

    public Torneio salvar(Torneio torneio){
        return repository.save(torneio);
    }

    public List<Torneio> listar(){
        return repository.findAll();
    }
}
