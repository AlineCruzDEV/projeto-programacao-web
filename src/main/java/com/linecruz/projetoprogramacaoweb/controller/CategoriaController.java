package com.linecruz.projetoprogramacaoweb.controller;

import com.linecruz.projetoprogramacaoweb.model.dto.CategoriaDTO;
import com.linecruz.projetoprogramacaoweb.service.CategoriaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaController extends BaseController<CategoriaDTO, CategoriaService> {

    public CategoriaController(CategoriaService service) {
        super(service);
    }
}
