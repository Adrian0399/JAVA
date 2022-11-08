package Clase3Strings;

public class StringValidarEjemplo {
    public static void main(String[] args) {
        
        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if (esNulo){
            curso = "";//"Programacion JAVA";
        }

        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        if (!esVacio) {
        System.out.println(curso.toUpperCase());
        System.out.println("Bienvenido al curso " + curso);
        System.out.println("Bienvenido al curso " .concat(curso));
        }

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);
        if (!esVacio2){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso " .concat(curso));
        }

        boolean esBlanco = curso.isBlank(); // (isBlank es la mejor manera de validar los String)
        System.out.println("esBlanco = " + esBlanco);

        if (esBlanco == false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
