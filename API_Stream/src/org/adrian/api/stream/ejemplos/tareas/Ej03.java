package org.adrian.api.stream.ejemplos.tareas;

//Aplanar un arreglo bidimensional en un nivel y eliminar repetidos
//El siguiente ejercicio es aplanar un arreglo bidimensional en un nivel y eliminar repetidos usando el api stream.
//Aplanar un arreglo significa quitar los elementos del arreglo anidado y dejarlos en el arreglo de primer nivel.
//Por ejemplo, para el arreglo:
//String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
//debería quedar:
//{"java", "groovy", "php", "c#", "python", "javascript", "kotlin"};

import java.util.Arrays;

public class Ej03 {
    public static void main(String[] args) {
        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
        Arrays.stream(lenguajes)
                .flatMap(arr -> Arrays.stream(arr))
                .distinct()
                .forEach(e -> System.out.println(e));

        //Forma 2 con funcion Lambda
        //String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
        //Function<String[][], List<String>> flatten = arr ->  Arrays.stream(arr).flatMap(a -> Arrays.stream(a))
        //        .distinct()
        //        .collect(Collectors.toList());
        //flatten.apply(lenguajes).forEach(e -> System.out.println(e));

    }
}
