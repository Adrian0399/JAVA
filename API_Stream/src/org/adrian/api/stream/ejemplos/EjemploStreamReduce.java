package org.adrian.api.stream.ejemplos;

import java.util.stream.Stream;

//MAP siempre devuelve un resultado, el resultado cambiado
public class EjemploStreamReduce {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Paco Gonzalez", "Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Paco Gonzalez", "Pepe Mena", "Paco Gonzalez", "Pepe Garcia")
                .distinct();
        
        String resultado = nombres.reduce("Resultado concatenacion", (a, b) -> a + ", " + b);
        System.out.println(" " + resultado);

    }
}
