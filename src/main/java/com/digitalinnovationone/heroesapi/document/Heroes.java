package com.digitalinnovationone.heroesapi.document;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import org.springframework.data.annotation.Id;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@DynamoDBTable(tableName = "Heroes")
public class Heroes {
    @Id
    @DynamoDBHashKey(attributeName = "id")
    private String id;

    @DynamoDBAttribute(attributeName = "name")
    private String name;

    @DynamoDBAttribute(attributeName = "universe")
    private String universe;

    @DynamoDBAttribute(attributeName = "films")
    private int films;

    @DynamoDBAttribute(attributeName = "genero")
    private String genero;

    @DynamoDBAttribute(attributeName = "autor")
    private String autor;

    @DynamoDBAttribute(attributeName = "ano_lancamento")
    private int ano_lancamento;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUniverse() {
        return universe;
    }
    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public int getFilms() {
        return films;
    }
    public void setFilms(int films) {
        this.films = films;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero){ this.genero = genero;}

    public String getAutor(){return autor;}
    public void setAutor(String autor){this.autor = autor;}

    public int getAno_lancamento(){return ano_lancamento;}
    public void setAno_lancamento(int ano_lancamento){this.ano_lancamento = ano_lancamento;}

    public Heroes(String id, String name, String universe, int films, String genero, String autor, int ano_lancamento ) {
        this.id = id;
        this.name = name;
        this.universe = universe;
        this.films = films;
        this.genero = genero;
        this.autor = autor;
        this.ano_lancamento = ano_lancamento;

    }
}
