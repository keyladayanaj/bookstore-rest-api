package com.github.keyladayanaj.keyla_557630_mod1.service;

import com.github.keyladayanaj.keyla_557630_mod1.dto.EditoraInputDTO;
import com.github.keyladayanaj.keyla_557630_mod1.dto.EditoraResponseDTO;
import com.github.keyladayanaj.keyla_557630_mod1.entities.Editora;
import com.github.keyladayanaj.keyla_557630_mod1.repositories.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EditoraService {

    @Autowired
    private EditoraRepository editoraRepository;

    @Transactional(readOnly = true)
    public List<EditoraResponseDTO> findAll() {
        return editoraRepository.findAll()
                .stream()
                .map(e -> new EditoraResponseDTO(e.getId(), e.getNome(), e.getEmail()))
                .toList();
    }

    @Transactional
    public EditoraResponseDTO create(EditoraInputDTO inputDTO) {
        Editora editora = new Editora();
        editora.setNome(inputDTO.getNome());
        editora.setEmail(inputDTO.getEmail());
        editora = editoraRepository.save(editora);
        return new EditoraResponseDTO(editora.getId(), editora.getNome(), editora.getEmail());
    }
}