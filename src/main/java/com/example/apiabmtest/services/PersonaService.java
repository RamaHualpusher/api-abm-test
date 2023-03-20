package com.example.apiabmtest.services;

import com.example.apiabmtest.entities.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long>{
    List<Persona> search(String filtro) throws Exception;
}
