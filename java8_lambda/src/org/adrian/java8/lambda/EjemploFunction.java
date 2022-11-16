package org.adrian.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        //Una funcion en una expresion lambda, recibe un argumento como parametro y tambien devuelve un valor, podemos hacer algo con esta argumento, lo consumimos y ademas devolvemos el valor
        Function<String, String> f1 = param -> "Hola que tal !" + param;
        String resultado = f1.apply("Adrian");
        System.out.println(resultado);

        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("Adrian Olvera"));

        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("Adrian", "Daniel");
        System.out.println(r2);

        BiFunction<String, String, Integer> f4 = String::compareTo; //(a, b) -> a.compareTo(b);
        System.out.println(f4.apply("Adrian", "Adria"));

        BiFunction<String, String, String> f5 = String::concat; //(a, b) -> a.concat(b);
        System.out.println(f5.apply("Adrian", "Adria"));
    }
}
