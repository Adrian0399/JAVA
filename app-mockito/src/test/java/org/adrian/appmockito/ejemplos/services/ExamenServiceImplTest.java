package org.adrian.appmockito.ejemplos.services;

import org.adrian.appmockito.ejemplos.models.Examen;
import org.adrian.appmockito.ejemplos.repositories.ExamenRepository;
import org.adrian.appmockito.ejemplos.repositories.ExamenRepositoryOtro;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ExamenServiceImplTest {

    @Test
    void findExamenPorNombre() {
        ExamenRepository repository = mock(ExamenRepositoryOtro.class);
        ExamenService service = new ExamenServiceImpl(repository);
        List<Examen> datos = Arrays.asList(new Examen(5L, "Matemáticas"),
                new Examen(6L, "Lenguaje"),
                new Examen(7L, "Historia"));

        when(repository.findAll()).thenReturn(datos);
        Optional<Examen> examen = service.findExamenPorNombre("Matemáticas");

        assertTrue(examen.isPresent());
        assertEquals(5L, examen.orElseThrow().getId());
        assertEquals("Matemáticas", examen.get().getNombre());
    }

    @Test
    void findExamenPorNombreListaVacia() {
        ExamenRepository repository = mock(ExamenRepositoryOtro.class);
        ExamenService service = new ExamenServiceImpl(repository);
        List<Examen> datos = Collections.emptyList();

        when(repository.findAll()).thenReturn(datos);
        Optional<Examen> examen = service.findExamenPorNombre("Matemáticas");

        assertTrue(examen.isPresent());
        assertEquals(5L, examen.orElseThrow().getId());
        assertEquals("Matemáticas", examen.get().getNombre());
    }
}