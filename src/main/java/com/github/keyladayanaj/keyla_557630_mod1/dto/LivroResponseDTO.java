package com.github.keyladayanaj.keyla_557630_mod1.dto;

import java.util.List;

public class LivroResponseDTO {

    private Long id;
    private String titulo;
    private Integer anoPublicacao;
    private  String isbn;

    public LivroResponseDTO(Long id, String titulo, Integer anoPublicacao, String isbn) {
        this.id = id;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
    }

    public static List<LivroResponseDTO> creaMock(){
        return List.of(
                new LivroResponseDTO(1L,"TituloPedro",20,"A"),
                new LivroResponseDTO(2L,"TituloGabriel",20,"B"),
                new LivroResponseDTO(3L,"TituloDiego",20,"C")
        );
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getIsbn() {
        return isbn;
    }
}
