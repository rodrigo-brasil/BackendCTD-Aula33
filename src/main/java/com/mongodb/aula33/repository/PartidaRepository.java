package com.mongodb.aula33.repository;

import com.mongodb.aula33.model.Partida;
import com.mongodb.aula33.model.StatusPartida;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartidaRepository extends MongoRepository<Partida,String> {
    @Query
    List<Partida> findAllByStatus(StatusPartida status);
}
