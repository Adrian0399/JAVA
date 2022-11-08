package Clase10ClaseMath;

import java.util.Scanner;

public class EjAreaDeUnCirculo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double area;
        double radio;
        System.out.println("Ingresa el radio del circulo: ");
        radio=s.nextDouble();
        area=Math.PI * Math.pow(radio, 2);

        System.out.println("El area del radio: " + radio + "cm, es de " + area + "cm^2");

    }
}
