package com.linecruz.projetoprogramacaoweb.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "livro")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "isbn", nullable = false, unique = true, length = 13)
    private String isbn;
    @JoinColumn(name = "categoria_livro_id", nullable = false)
    //@ManyToOne(fetch = FetchType.EAGER)
    @ManyToOne()
    private Categoria categoriaLivro;
    @JoinColumn(name = "editora_livro_id", nullable = false)
    //@ManyToOne(fetch = FetchType.EAGER)
    @ManyToOne()
    private Editora editoraLivro;
    @Column(name = "nome", nullable = false, unique = true)
    private String nome;
}
