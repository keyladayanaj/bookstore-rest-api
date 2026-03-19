package com.github.keyladayanaj.keyla_557630_mod1.controller;

import com.github.keyladayanaj.keyla_557630_mod1.dto.LivroDTO;
import com.github.keyladayanaj.keyla_557630_mod1.dto.LivroInputDTO;
import com.github.keyladayanaj.keyla_557630_mod1.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public ResponseEntity<List<LivroDTO>> getAllLivros() {
        List<LivroDTO> livros = livroService.findAllLivros();
        return ResponseEntity.ok(livros);
    }

    @PostMapping
    public ResponseEntity<LivroDTO> createLivro(@RequestBody LivroInputDTO inputDTO) {
        LivroDTO dto = livroService.create(inputDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId())
                .toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}