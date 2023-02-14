package com.linecruz.projetoprogramacaoweb.model.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoriaDTO {
    private Long id;
    @NotBlank(message = "O campo nome é obrigatório")
    private String nome;
}
