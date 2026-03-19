package com.github.keyladayanaj.keyla_557630_mod1.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer anoPublicacao;
    private String isbn;

    // Uma editora publica vários livros → Livro tem @ManyToOne para Editora
    @ManyToOne
    @JoinColumn(name = "editora_id")
    private Editora editora;
}