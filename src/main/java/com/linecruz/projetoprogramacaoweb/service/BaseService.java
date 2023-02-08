package com.linecruz.projetoprogramacaoweb.service;

import java.util.List;

public interface BaseService<T> {

    List<T> findAll();
    T findById(Long id);
    T create(T clienteDTO);
    T edit(Long id, T clienteDTO);
    void delete(Long id);
}