package com.linecruz.projetoprogramacaoweb.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LivroDTO{
    private Long id;
    @NotNull(message = "O campo Categoria é obrigatório!")
    private CategoriaDTO categoriaLivro;
    @NotNull(message = "O campo Editora é obrigatório!")
    private EditoraDTO editoraLivro;
    @NotBlank(message = "O campo nome  é obrigatório!")
    private String nome;
    @NotNull(message = "O campo isbn  é obrigatório!")
    private String isbn;
}