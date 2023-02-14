package com.linecruz.projetoprogramacaoweb.controller;

import com.linecruz.projetoprogramacaoweb.model.dto.EditoraDTO;
import com.linecruz.projetoprogramacaoweb.service.EditoraService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/editoras")
public class EditoraController extends BaseController<EditoraDTO, EditoraService> {
    public EditoraController(EditoraService service) {
        super(service);
    }

//    @GetMapping("/{editora}/livros")
//    public ResponseEntity<LivrosDTO> findBooksByPublisher(@PathVariable("editora") Long editora) {
//        try {
//            return ResponseEntity.ok(service.findBooksByPublisher(editora));
//
//        } catch (EntityNotFoundException e) {
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//    }
}
