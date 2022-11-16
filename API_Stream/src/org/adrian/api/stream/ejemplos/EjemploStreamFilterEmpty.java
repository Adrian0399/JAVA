package org.adrian.api.stream.ejemplos;

import org.adrian.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

//MAP siempre devuelve un resultado, el resultado cambiado
public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {

        long count = Stream
                .of("Pato Guzman", "Paco Gonzalez", "", "Pepe Mena", "")
                .filter(String::isEmpty)
                .peek(System.out::println)
               .count();
        System.out.println("count = " + count);
    }
}
