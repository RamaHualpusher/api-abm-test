package com.example.apiabmtest.repositories;

import com.example.apiabmtest.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    //boolean existsByDni(int dni);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> search(@Param("filtro") String filtro);
    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            nativeQuery = true
    )
    List<Persona> searchNativo(@Param("filtro") String filtro);

    //Otras opciones sin usaar @Param
    /* @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %?1% OR p.apellido LIKE %?1%")
    List<Persona> search(String filtro);*/

    /*@Query(
            value = "SELECT * FROM persona p WHERE p.nombre LIKE %?1% OR p.apellido LIKE %?1%",
            nativeQuery = true
    )
    List<Persona> searchNative(String filtro);*/


}
