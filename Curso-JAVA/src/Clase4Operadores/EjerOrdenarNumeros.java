package Clase4Operadores;

import java.util.Scanner;

public class EjerOrdenarNumeros {
    public static void main(String[] args) {

        int max = 0; //declarar el numero max
        int min = 0;

        Scanner s = new Scanner(System.in);
        System.out.println(" Ingrese el 1er numero: ");
        int num1 = s.nextInt();
        System.out.println(" Ingrese el 2do numero: ");
        int num2 = s.nextInt();

        max = (num1 > num2)? num1: num2;
        min = (num1 > num2)? num2: num1;


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
