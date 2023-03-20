package com.example.apiabmtest.controllers;

import com.example.apiabmtest.entities.Persona;
import com.example.apiabmtest.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro) throws Exception {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.search(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"" + e.getMessage() + "\"}");
        }
    }

}
