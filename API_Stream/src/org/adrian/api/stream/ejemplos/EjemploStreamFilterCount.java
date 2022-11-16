package org.adrian.api.stream.ejemplos;

import org.adrian.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

//MAP siempre devuelve un resultado, el resultado cambiado
public class EjemploStreamFilterCount {
    public static void main(String[] args) {

        long count = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();

        System.out.println(count);

    }

}
