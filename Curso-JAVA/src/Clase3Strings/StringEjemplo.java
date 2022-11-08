package Clase3Strings;

public class StringEjemplo {
    public static void main(String[] args) {
        String curso = "Programación JAVA";
        String curso2 = new String("programación java");

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2); //Ignorar Mayus y Minus
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        String curso3 = "Programación JAVA";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);




    }
}
