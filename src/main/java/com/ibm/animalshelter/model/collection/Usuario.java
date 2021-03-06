package com.ibm.animalshelter.model.collection;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "usuario")
public class Usuario {

    @Schema(description = "Identificador único do usuário")
    @Id
    private String id;

    @Schema(description = "Nome de usuário")
    private String usuario;

    @Schema(description = "E-mail do usuário")
    private String email;

    @Schema(description = "Senha do usuário")
    private String senha;

    public Usuario(String id, String usuario, String email, String senha) {
        this.id = id;
        this.usuario = usuario;
        this.email = email;
        this.senha = senha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
