package com.example.apiabmtest.services;

import com.example.apiabmtest.entities.Persona;
import com.example.apiabmtest.repositories.BaseRepository;
import com.example.apiabmtest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{

    /*Se hace una inyección de dependencias, donde Spring va a ser el encargado de obtener las dependecias
    * que necesita el servicio.
    * Ésta misma tarea se puede hacer con la anotación @Autowired*/
    @Autowired
    private PersonaRepository personaRepository;
    public PersonaServiceImpl(BaseRepository<Persona,Long> baseRepository) {
        super(baseRepository);
    }

}
