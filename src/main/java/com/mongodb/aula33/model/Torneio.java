package com.mongodb.aula33.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "torneios")
public class Torneio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String nome, pais;

}
