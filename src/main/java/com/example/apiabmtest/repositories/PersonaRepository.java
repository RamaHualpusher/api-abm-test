package com.example.apiabmtest.repositories;

import com.example.apiabmtest.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
