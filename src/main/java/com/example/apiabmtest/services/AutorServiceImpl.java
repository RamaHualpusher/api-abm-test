package com.example.apiabmtest.services;

import com.example.apiabmtest.entities.Autor;
import com.example.apiabmtest.repositories.AutorRepository;
import com.example.apiabmtest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor,Long> baseRepository) {
        super(baseRepository);
    }
}
