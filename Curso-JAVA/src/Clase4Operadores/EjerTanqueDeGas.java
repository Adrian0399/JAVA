package Clase4Operadores;

import java.util.Scanner;

public class EjerTanqueDeGas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa los litros del tanque: ");
        double lt = s.nextDouble();

        if (lt == 79){
            System.out.println("Tanque lleno");
        } else if (lt >= 60 && lt <= 70){
            System.out.println("Tanque casi lleno");
        } else if (lt >= 40 && lt <= 59.9){
            System.out.println("Tanque 3/4");
        } else if (lt >= 35 && lt <= 39.9){
            System.out.println("Tanque a la mitad");
        } else if (lt >= 20 && lt <= 34.9){
            System.out.println("Tanque suficiente");
        } else if (lt >= 1 && lt <= 19.9){
            System.out.println("Tanque insuficiente");
        }
    }
}
