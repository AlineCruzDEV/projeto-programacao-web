package com.linecruz.projetoprogramacaoweb.model.mapper;

import com.linecruz.projetoprogramacaoweb.model.dto.EditoraDTO;
import com.linecruz.projetoprogramacaoweb.model.entity.Editora;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface EditoraMapper {
    List<EditoraDTO> parseListDTO(List<Editora> editoras);
    EditoraDTO parseDTO(Editora editora);
    Editora parseEntity(EditoraDTO editora);
}
