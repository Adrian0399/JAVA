package org.adrian.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//MAP siempre devuelve un resultado, el resultado cambiado
public class EjemploStreamRange {
    public static void main(String[] args) {

        IntStream num = IntStream.rangeClosed(5, 20).peek(System.out::println);
        
        // int resultado = nombres.reduce(0, Integer::sum);
        // int resultado = num.sum();

        IntSummaryStatistics stats = num.summaryStatistics();
        System.out.println("max: " + stats.getMax());
        System.out.println("min: " + stats.getMin());
        System.out.println("suma: " + stats.getSum());
        System.out.println("Promedio: " + stats.getAverage());
        System.out.println("Total: " + stats.getCount());

    }
}
