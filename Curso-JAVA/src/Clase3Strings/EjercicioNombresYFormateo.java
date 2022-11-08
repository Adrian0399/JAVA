package Clase3Strings;

import java.util.Scanner;
public class EjercicioNombresYFormateo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.println("Ingrese el nombre del papá: ");
        String papa = s.nextLine();
        System.out.println("Ingrese el nombre de la mamá: ");
        String mama = s.next();
        System.out.println("Ingrese el nombre de la hermana: ");
        String hermana = s.next();
        System.out.println("Ingresa tu nombre: ");
        String yo = s.next();

        System.out.println("papa = " + papa + " = " + papa.toUpperCase().charAt(1) + "." + papa.substring(papa.length()-2));
        System.out.println("mama = " + mama + " = " + mama.toUpperCase().charAt(1) + "." + mama.substring(mama.length()-2));
        System.out.println("hermana = " + hermana + " = " + hermana.toUpperCase().charAt(1) + "." + hermana.substring(hermana.length()-2));
        System.out.println("yo = " + yo + " = " + yo.toUpperCase().charAt(1) + "." + yo.substring(yo.length()-2));
    }
}
