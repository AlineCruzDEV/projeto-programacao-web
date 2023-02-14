package com.linecruz.projetoprogramacaoweb.service;

import com.linecruz.projetoprogramacaoweb.model.dto.LivroDTO;

import java.util.List;

public interface LivroService extends BaseService<LivroDTO> {
    List<LivroDTO> filter(LivroDTO livroDTO);
}
