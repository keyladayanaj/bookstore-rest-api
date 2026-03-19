package com.github.keyladayanaj.keyla_557630_mod1.dto;

import com.github.keyladayanaj.keyla_557630_mod1.entities.Livro;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LivroDTO {

    private Long id;

    @NotBlank(message = "Campo não pode ser nulo ou em branco")
    @Size(min = 3, max = 100, message = "O título deve ter entre 3 e 100 caracteres")
    private String titulo;

    private Integer anoPublicacao;

    @NotBlank(message = "Campo não pode ser nulo ou em branco")
    @Size(min = 3, max = 100, message = "O ISBN deve ter entre 3 e 100 caracteres")
    private String isbn;

    private String editoraNome;

    public LivroDTO(Livro livro) {
        id = livro.getId();
        titulo = livro.getTitulo();
        anoPublicacao = livro.getAnoPublicacao();
        isbn = livro.getIsbn();
        editoraNome = (livro.getEditora() != null) ? livro.getEditora().getNome() : null;
    }
}