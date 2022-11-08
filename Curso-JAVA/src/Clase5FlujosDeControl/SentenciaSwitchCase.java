package Clase5FlujosDeControl;

import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero del mes entre 1 - 12");
        int mes = s.nextInt();
        String nombreMes = null;

        switch (mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
        }


        //byte num = 1; // switch soporta byte
        char num = 'a';
        switch(num){
            case '0':
                System.out.println("El num es cero");
                break;
            case '1':
                System.out.println("El num es uno");
                break;
            case '2':
                System.out.println("El num es dos");
                break;
            case '3':
                System.out.println("El num es tres");
                break;
            case 'a':
                System.out.println("El num es a");
                break;
            default:
                System.out.println("Numero o caracter desconocido");
        }

        String nombre = "Pedro";
        switch (nombre){
            case "Alberto":
                System.out.println("Hola Andres, Bienvenido");
                break;
            case "Adrian":
                System.out.println("Hola Adrian, root");
                break;
            case "Pepe":
                System.out.println("Hola pepe");
                break;
            default:
                System.out.println("Usuario desconocido");
        }

    }
}
