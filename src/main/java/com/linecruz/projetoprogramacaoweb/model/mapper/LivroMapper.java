package com.linecruz.projetoprogramacaoweb.model.mapper;

import com.linecruz.projetoprogramacaoweb.model.dto.LivroDTO;
import com.linecruz.projetoprogramacaoweb.model.entity.Livro;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LivroMapper {
    List<LivroDTO> parseListDTO(List<Livro> livros);

    @Mapping(source = "categoriaLivro", target = "categoriaLivro")
    @Mapping(source = "editoraLivro", target = "editoraLivro")
    LivroDTO parseDTO(Livro livro);

    @Mapping(source = "categoriaLivro", target = "categoriaLivro")
    @Mapping(source = "editoraLivro", target = "editoraLivro")
    Livro parseEntity(LivroDTO livro);
}
