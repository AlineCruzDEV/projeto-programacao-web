package com.linecruz.projetoprogramacaoweb.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import java.util.List;

@Entity
@Table(name = "editora")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Editora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome", nullable = false, unique = true)
    private String nome;
    @Column(name = "descricao")
    private String descricao;

//    @OneToMany(mappedBy = "editoraLivro")
//    private List<Livro> livros;
}
