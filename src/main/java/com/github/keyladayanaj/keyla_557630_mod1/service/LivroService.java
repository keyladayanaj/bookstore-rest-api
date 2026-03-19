package com.github.keyladayanaj.keyla_557630_mod1.service;

import com.github.keyladayanaj.keyla_557630_mod1.dto.LivroDTO;
import com.github.keyladayanaj.keyla_557630_mod1.dto.LivroInputDTO;
import com.github.keyladayanaj.keyla_557630_mod1.entities.Editora;
import com.github.keyladayanaj.keyla_557630_mod1.entities.Livro;
import com.github.keyladayanaj.keyla_557630_mod1.repositories.EditoraRepository;
import com.github.keyladayanaj.keyla_557630_mod1.repositories.LivroRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    @Autowired
    private EditoraRepository editoraRepository;

    @Transactional(readOnly = true)
    public List<LivroDTO> findAllLivros() {
        return livroRepository.findAll()
                .stream()
                .map(LivroDTO::new)
                .toList();
    }

    @Transactional
    public LivroDTO create(LivroInputDTO inputDTO) {
        Livro livro = new Livro();
        livro.setTitulo(inputDTO.getTitulo());
        livro.setAnoPublicacao(inputDTO.getAnoPublicacao());
        livro.setIsbn(inputDTO.getIsbn());

        if (inputDTO.getEditoraId() != null) {
            Editora editora = editoraRepository.findById(inputDTO.getEditoraId())
                    .orElseThrow(() -> new EntityNotFoundException("Editora não encontrada: " + inputDTO.getEditoraId()));
            livro.setEditora(editora);
        }

        livro = livroRepository.save(livro);
        return new LivroDTO(livro);
    }
}