package org.adrian.api.stream.ejemplos.tareas;

//Obtener el numero mayor en un arreglo con programación funcional lambda y api stream

import java.util.Arrays;
import java.util.function.Function;

public class Ej02 {
    public static void main(String[] args) {

        //Funcion labda que obtiene el numero mayor de arreglo usando api stream en su implementacion
        Function<Integer[], Integer> max = arr -> Arrays.stream(arr).reduce(0, (ac, e) -> ac > e? ac: e);

        int resultado = max.apply(new Integer[]{1, 78, -1700, 2500, 0, 2000, 54, 2});
        System.out.println(resultado);
    }
}
