package com.mongodb.aula33.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "partidas")
public class Partida {
    @Id
    String id;
    StatusPartida status;
    String resultado;
    @DBRef
    Time local, visitante;
}
