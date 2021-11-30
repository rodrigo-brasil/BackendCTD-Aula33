package com.mongodb.aula33.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "times")
public class Time implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String nome, pais;

}
