package com.linecruz.projetoprogramacaoweb.model.mapper;

import com.linecruz.projetoprogramacaoweb.model.dto.CategoriaDTO;
import com.linecruz.projetoprogramacaoweb.model.entity.Categoria;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {

    List<CategoriaDTO> parseListDTO(List<Categoria> categorias);
    CategoriaDTO parseDTO(Categoria categoria);
    Categoria parseEntity(CategoriaDTO categoria);
}
