package org.adrian.optional.ejemplo;

import org.adrian.optional.ejemplo.models.Computador;
import org.adrian.optional.ejemplo.models.repositorio.ComputadorRepositorio;
import org.adrian.optional.ejemplo.models.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        repositorio.filtrar("asus").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontro"));

        //Optional<Computador> pc = repositorio.filtrar("asus rog");

        /* if (pc.isPresent()){
        System.out.println(pc.get().toString());
        } else {
            System.out.println("No se encontro");
        } */


    }
}
