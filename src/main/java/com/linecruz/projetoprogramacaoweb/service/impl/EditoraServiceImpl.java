package com.linecruz.projetoprogramacaoweb.service.impl;

import com.linecruz.projetoprogramacaoweb.model.dto.EditoraDTO;
import com.linecruz.projetoprogramacaoweb.model.entity.Editora;
import com.linecruz.projetoprogramacaoweb.model.mapper.EditoraMapper;
import com.linecruz.projetoprogramacaoweb.repository.EditoraRepository;
import com.linecruz.projetoprogramacaoweb.service.EditoraService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EditoraServiceImpl implements EditoraService {
    private final EditoraRepository repository;
    private final EditoraMapper mapper;

    public EditoraServiceImpl(EditoraRepository repository, EditoraMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<EditoraDTO> findAll() {
        return mapper.parseListDTO(repository.findAll());
    }

    @Override
    public EditoraDTO findById(Long id) {

        Optional<Editora> editoraOptional = repository.findById(id);
        if (editoraOptional.isPresent()) {
            Editora editora = editoraOptional.get();
            return mapper.parseDTO(editora);
        }

        throw new EntityNotFoundException();
    }

    @Override
    public EditoraDTO create(EditoraDTO entity) {

        Editora editora = mapper.parseEntity(entity);
        editora.setId(null);
        repository.save(editora);
        return mapper.parseDTO(editora);
    }

    @Override
    public EditoraDTO edit(Long id, EditoraDTO entity) {

        if (repository.existsById(id)) {
            Editora editora = mapper.parseEntity(entity);
            editora.setId(id);
            editora = repository.save(editora);
            return mapper.parseDTO(editora);
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
}
