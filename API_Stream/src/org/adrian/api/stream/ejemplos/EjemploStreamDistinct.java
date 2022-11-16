package org.adrian.api.stream.ejemplos;

import org.adrian.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

//MAP siempre devuelve un resultado, el resultado cambiado
public class EjemploStreamDistinct {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Paco Gonzalez", "Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Paco Gonzalez", "Pepe Mena", "Paco Gonzalez", "Pepe Garcia")
                .distinct();

        nombres.forEach(System.out::println);

    }
}
