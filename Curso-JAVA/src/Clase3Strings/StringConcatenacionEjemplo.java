package Clase3Strings;

public class StringConcatenacionEjemplo {
    public static void main(String[] args) {
        String curso = "Programación JAVA";
        String profesor = "Adrian Olvera";

        String resultado = curso.concat(profesor);
        System.out.println("profesor = " + profesor);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });

        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3);

        /* String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB);

        System.out.println(detalle + (numeroA + numeroB));

        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(" con " + profesor);
        String detalle3 = curso.concat(" con ") .concat(profesor); //La mejor forma de concatenar

        System.out.println("detalle2 = " + detalle2);
        System.out.println("detalle3 = " + detalle3);
        */


    }
}
