package com.github.keyladayanaj.keyla_557630_mod1.dto;

public class LivroInputDTO {

    private String titulo;
    private Integer anoPublicacao;
    private String isbn;
    private Long editoraId; // referência à editora ao criar um livro

    public LivroInputDTO() {}

    public LivroInputDTO(String titulo, Integer anoPublicacao, String isbn, Long editoraId) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.editoraId = editoraId;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Integer getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(Integer anoPublicacao) { this.anoPublicacao = anoPublicacao; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public Long getEditoraId() { return editoraId; }
    public void setEditoraId(Long editoraId) { this.editoraId = editoraId; }
}