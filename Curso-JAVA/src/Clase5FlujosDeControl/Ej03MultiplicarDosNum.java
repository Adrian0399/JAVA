package Clase5FlujosDeControl;

import java.util.Scanner;

public class Ej03MultiplicarDosNum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero a: ");
        int a = s.nextInt();

        System.out.println("Ingrese el numero b: ");
        int b = s.nextInt();

        int resultado = 0;

        //Verificacmos los signos de cada uno, si es positivo o negativo
        boolean positivoB = b > -1;
        boolean positivoA = a > -1;

        //Calcular el valor absoluto de a
        int absolutoA = positivoA? a: -a; //Equivalente a Math.abs(a);

        //Sumamos tantas veces el valor de b, segun el valor de a.
        for (int i = 0; i < absolutoA; i++){
            resultado = resultado + b;
        }

        //SI ambos son negativos o si solo a es negativo le damos vuelta al signo
        if ((!positivoA && !positivoB) || !positivoA){
            resultado = -resultado;
        }
        System.out.println("El resultado es " + resultado);

    }
}
