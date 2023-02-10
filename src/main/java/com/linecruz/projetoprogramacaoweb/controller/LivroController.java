package com.linecruz.projetoprogramacaoweb.controller;

import com.linecruz.projetoprogramacaoweb.model.dto.LivroDTO;
import com.linecruz.projetoprogramacaoweb.service.LivroService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController extends BaseController<LivroDTO, LivroService> {
    public LivroController(LivroService service) {
        super(service);
    }
}
