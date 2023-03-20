package com.example.apiabmtest.controllers;

import com.example.apiabmtest.entities.Localidad;
import com.example.apiabmtest.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{
}
