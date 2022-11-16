package org.adrian.api.stream.ejemplos;

import java.util.stream.Stream;

//MAP siempre devuelve un resultado, el resultado cambiado
public class EjemploStreamReduceInt {
    public static void main(String[] args) {

        Stream<Integer> nombres = Stream.of(5, 10, 15, 20);
        
        int resultado = nombres.reduce(0, Integer::sum);
        System.out.println(resultado);

    }
}
