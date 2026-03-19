package com.github.keyladayanaj.keyla_557630_mod1.dto;

public class EditoraInputDTO {


    private String nome;
    private String email;

    public EditoraInputDTO(){

    }

    public EditoraInputDTO(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
