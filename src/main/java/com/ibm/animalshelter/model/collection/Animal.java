package com.ibm.animalshelter.model.collection;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "animal")
public class Animal {

    @Schema(description = "Identificador único do animal")
    @Id
    private String id;

    @Schema(description = "Nome do animal")
    private String nome;

    @Schema(description = "Tipo do animal")
    private String tipo;

    @Schema(description = "Raça do animal")
    private String raca;

    @Schema(description = "Sexo do animal")
    private String sexo;

    @Schema(description = "Idade do animal")
    private int idade;

    @Schema(description = "O animal é castrado?")
    private boolean castrado;

    public Animal(String id, String nome, String tipo, String raca, String sexo, int idade, boolean castrado) {

        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.sexo = sexo;
        this.idade = idade;
        this.castrado = castrado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
}
