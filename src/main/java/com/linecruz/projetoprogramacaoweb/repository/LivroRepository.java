package com.linecruz.projetoprogramacaoweb.repository;

import com.linecruz.projetoprogramacaoweb.model.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}
