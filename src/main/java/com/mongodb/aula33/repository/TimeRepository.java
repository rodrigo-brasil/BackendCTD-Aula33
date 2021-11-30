package com.mongodb.aula33.repository;

import com.mongodb.aula33.model.Time;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepository extends MongoRepository<Time,String> {
}
