package com.example.apiabmtest.services;

import com.example.apiabmtest.entities.Localidad;
import com.example.apiabmtest.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
