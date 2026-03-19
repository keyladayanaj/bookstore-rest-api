package com.github.keyladayanaj.keyla_557630_mod1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_editora")
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    // Uma editora publica vários livros
    @OneToMany(mappedBy = "editora", cascade = CascadeType.ALL)
    private List<Livro> livros = new ArrayList<>();
}
