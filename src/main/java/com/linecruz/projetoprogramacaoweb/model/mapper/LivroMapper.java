package com.linecruz.projetoprogramacaoweb.model.mapper;

import com.linecruz.projetoprogramacaoweb.model.dto.LivroDTO;
import com.linecruz.projetoprogramacaoweb.model.entity.Livro;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LivroMapper {
    List<LivroDTO> parseListDTO(List<Livro> livros);
    LivroDTO parseDTO(Livro livro);
    Livro parseEntity(LivroDTO livro);
}
