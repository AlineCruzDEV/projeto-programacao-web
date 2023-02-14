package com.linecruz.projetoprogramacaoweb.repository;

import com.linecruz.projetoprogramacaoweb.model.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    @Query(value = "SELECT livro FROM Livro livro WHERE livro.categoriaLivro.id = :id")
    List<Livro> findByIdCategory(@Param("id") Long id);

    @Query(value = "SELECT livro FROM Livro livro WHERE livro.editoraLivro.id = :id")
    List<Livro> findByIdPublisher(@Param("id") Long id);
}
