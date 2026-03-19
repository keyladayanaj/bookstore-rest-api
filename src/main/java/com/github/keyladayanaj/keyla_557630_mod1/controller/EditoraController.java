package com.github.keyladayanaj.keyla_557630_mod1.controller;

import com.github.keyladayanaj.keyla_557630_mod1.dto.EditoraInputDTO;
import com.github.keyladayanaj.keyla_557630_mod1.dto.EditoraResponseDTO;
import com.github.keyladayanaj.keyla_557630_mod1.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/editora")
public class EditoraController {

    @Autowired
    private EditoraService editoraService;

    @GetMapping
    public ResponseEntity<List<EditoraResponseDTO>> getEditoras() {
        List<EditoraResponseDTO> dtos = editoraService.findAll();
        return ResponseEntity.ok(dtos);
    }

    @PostMapping
    public ResponseEntity<EditoraResponseDTO> createEditora(@RequestBody EditoraInputDTO inputDTO) {
        EditoraResponseDTO dto = editoraService.create(inputDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId())
                .toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}