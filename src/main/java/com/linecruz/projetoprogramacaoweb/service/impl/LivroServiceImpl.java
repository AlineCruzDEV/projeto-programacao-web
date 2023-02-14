package com.linecruz.projetoprogramacaoweb.service.impl;

import com.linecruz.projetoprogramacaoweb.model.dto.LivroDTO;
import com.linecruz.projetoprogramacaoweb.model.entity.Livro;
import com.linecruz.projetoprogramacaoweb.model.mapper.LivroMapper;
import com.linecruz.projetoprogramacaoweb.repository.LivroFilterRepository;
import com.linecruz.projetoprogramacaoweb.repository.LivroRepository;
import com.linecruz.projetoprogramacaoweb.service.LivroService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroServiceImpl implements LivroService {

    private final LivroRepository repository;
    private final LivroMapper mapper;
    private final LivroFilterRepository filterRepository;

    public LivroServiceImpl(LivroRepository repository, LivroMapper mapper, LivroFilterRepository filterRepository) {
        this.repository = repository;
        this.mapper = mapper;
        this.filterRepository = filterRepository;
    }

    @Override
    public List<LivroDTO> findAll() {
        return mapper.parseListDTO(repository.findAll());
    }

    @Override
    public LivroDTO findById(Long id) {
        Optional<Livro> livroOptional = repository.findById(id);
        if (livroOptional.isPresent()) {
            Livro livro = livroOptional.get();
            return mapper.parseDTO(livro);
        }

        throw new EntityNotFoundException();
    }

    @Override
    public LivroDTO create(LivroDTO entity) {

        Livro livro = mapper.parseEntity(entity);
        livro.setId(null);
        repository.save(livro);
        return mapper.parseDTO(livro);
    }

    @Override
    public LivroDTO edit(Long id, LivroDTO entity) {
        if (repository.existsById(id)) {
            Livro livro = mapper.parseEntity(entity);
            livro.setId(id);
            livro = repository.save(livro);
            return mapper.parseDTO(livro);
        }

        throw new EntityNotFoundException();
    }

    @Override
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException();
        }

        repository.deleteById(id);
    }

    public List<LivroDTO> filter(LivroDTO livroDTO) {
        Livro livro = mapper.parseEntity(livroDTO);
        List<Livro> livros = filterRepository.filter(livro);
        return mapper.parseListDTO(livros);
    }
}
