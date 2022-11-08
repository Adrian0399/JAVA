package Clase4Operadores;

import javax.swing.*;

public class OperadoresAritmeticos {
    /**
     * @param args
     */
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j; // 2 variables en una sola linea, cuando son del mismo tipo
        System.out.println("suma = " + suma);
        System.out.println("(i + j) = " + (i + j));
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));
        
        int multi = i * j;
        System.out.println("multi = " + multi);
        System.out.println("(i * j) = " + (i * j));

        int division = i / j;
        float div = (float) i / j;
        System.out.println("division = " + div);
        System.out.println("(i / j) = " + (i / j));

        int resto = i % j;
        System.out.println("resto = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero % 2 == 0){
            System.out.println("numero par = " + numero);
        }else {
            System.out.println("numero impar = " + numero);
        }
    }
}
