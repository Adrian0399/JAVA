package org.adrian.java8.lambda.tarea2;

import java.util.Map;

@FunctionalInterface
public interface ContadorPalabras {
    Map<String, Integer> contarPalabras(String frase);
}
