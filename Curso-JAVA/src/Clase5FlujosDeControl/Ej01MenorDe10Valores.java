package Clase5FlujosDeControl;

import java.util.Scanner;

public class Ej01MenorDe10Valores {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros a comparar: ");
        int cantidad = s.nextInt();

        //Preguntamos si es menor a 10
        if (cantidad < 10){
            System.out.println("Error: El maximo a comparar son 10 digitos");
        } else {
            int menor = Integer.MAX_VALUE; //Asignamos un valor maximo por defecto como numero menor para comenzar
            int numero;

            for (int i = 0; i < cantidad; i++){
                System.out.println("Ingrese el numero" + (i + 1) + ": ");
                numero = s.nextInt();
                menor = (numero < menor) ? numero: menor;
            }

            System.out.println("El número menor es: " + menor);
            if (menor < 10){
                System.out.println("El numero " + menor + " es menor que 10!");
            } else {
                System.out.println("EL numero " + menor + " es igual o mayor que 10!");
            }
        }
    }
}
