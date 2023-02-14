package com.linecruz.projetoprogramacaoweb.controller;

import com.linecruz.projetoprogramacaoweb.model.dto.CategoriaDTO;
import com.linecruz.projetoprogramacaoweb.service.CategoriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
@Slf4j
public class CategoriaController extends BaseController<CategoriaDTO, CategoriaService> {

    public CategoriaController(CategoriaService service) {
        super(service);
    }

//    @GetMapping("/{categoria}/livros")
//    public ResponseEntity<LivrosDTO> findBooksByCategory(@PathVariable("categoria") Long categoria) {
//        try {
//            return ResponseEntity.ok(service.findBooksByCategory(categoria));
//
//        } catch (EntityNotFoundException e) {
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//    }
}
