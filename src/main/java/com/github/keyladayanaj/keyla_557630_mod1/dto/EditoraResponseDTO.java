package com.github.keyladayanaj.keyla_557630_mod1.dto;

import java.util.List;

public class EditoraResponseDTO {

    private Long id;
    private String nome;
    private String email;

    public EditoraResponseDTO(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public  static List<EditoraResponseDTO> creaMock(){

        return List.of(
                new EditoraResponseDTO(1L, "Pedro","pedro@gmail"),
                new EditoraResponseDTO(2L, "Gabriel","gabriel@gmail"),
                new EditoraResponseDTO(3L, "Diege","diego@gmail") ,
                 new EditoraResponseDTO(4L, "Keyla","keyla@gmail"),
                new EditoraResponseDTO(5L, "Lara","lara@gmail")

        );
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
