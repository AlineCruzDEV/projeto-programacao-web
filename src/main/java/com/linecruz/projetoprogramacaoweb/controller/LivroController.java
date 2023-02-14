package com.linecruz.projetoprogramacaoweb.controller;

import com.linecruz.projetoprogramacaoweb.model.dto.LivroDTO;
import com.linecruz.projetoprogramacaoweb.service.LivroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@Slf4j
public class LivroController extends BaseController<LivroDTO, LivroService> {
    public LivroController(LivroService service) {
        super(service);
    }

    @PostMapping("/filtrar")
    public ResponseEntity<List<LivroDTO>> filter(@RequestBody LivroDTO livroDTO) {
        try {
            List<LivroDTO> list = service.filter(livroDTO);
            if (list.size() == 0) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body(list);
            } else {
                return ResponseEntity
                        .status(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(list);
            }
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/filtrar/categoria/{categoria}")
    public ResponseEntity<List<LivroDTO>> filterByIdCategory(@PathVariable("categoria") Long id) {
        try {
            List<LivroDTO> list = service.filterByIdCategory(id);
            if (list.size() == 0) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body(list);
            } else {
                return ResponseEntity
                        .status(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(list);
            }
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/filtrar/editora/{editora}")
    public ResponseEntity<List<LivroDTO>> filterByIdPublisher(@PathVariable("editora") Long id) {
        try {
            List<LivroDTO> list = service.filterByIdPublisher(id);
            if (list.size() == 0) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body(list);
            } else {
                return ResponseEntity
                        .status(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(list);
            }
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
