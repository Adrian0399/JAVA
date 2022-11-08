package Clase5FlujosDeControl;

import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float promedio = 0f;
        System.out.println("Ingresa tu promedio");
        promedio = s.nextFloat();

        if(promedio >= 7.0){
            System.out.println("Excelente");
        } else if (promedio >= 6.0 ){
            System.out.println("Bueno");
        } else if (promedio >= 4.0){
            System.out.println("Mas o menos");
        } else if (promedio <= 3.9){
            System.out.println("Reprobado");
        }

        System.out.println("Tu promedio es " + promedio);

    }
}
