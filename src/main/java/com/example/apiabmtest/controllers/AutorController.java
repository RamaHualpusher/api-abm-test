package com.example.apiabmtest.controllers;

import com.example.apiabmtest.entities.Autor;
import com.example.apiabmtest.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{
}
