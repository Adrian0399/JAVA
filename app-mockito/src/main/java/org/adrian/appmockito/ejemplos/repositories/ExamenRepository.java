package org.adrian.appmockito.ejemplos.repositories;

import org.adrian.appmockito.ejemplos.models.Examen;

import java.util.List;

public interface ExamenRepository {
    Examen guardar(Examen examen);
    List<Examen> findAll();


}
