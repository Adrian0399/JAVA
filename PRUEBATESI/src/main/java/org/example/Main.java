package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner s = new Scanner(System.in);

        int edad = 0;
        System.out.println("Digite su edad");
        edad = s.nextInt();
        
        if (edad >= 30){
            System.out.println("Ya estas ruco como el fin");
        } else if (edad <= 29 && edad >=18) {
            System.out.println("Estas morro");
        } else if (edad <=18) {
            System.out.println("Eres un niñato");
        }

    }


}