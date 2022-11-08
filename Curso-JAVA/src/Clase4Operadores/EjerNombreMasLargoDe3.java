package Clase4Operadores;

import javax.swing.*;
import java.util.Scanner;

public class EjerNombreMasLargoDe3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String name1 = JOptionPane.showInputDialog("Ingresa el primer nombre completo: ");
        String name2 = JOptionPane.showInputDialog("Ingresa el segundo nombre completo: ");
        String name3 = JOptionPane.showInputDialog("Ingresa el tercer nombre completo: ");

        String max = (name1.split(" ")[0].length() < name2.split(" ")[0].length()) ? name2: name1;
        max = (name3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: name3;

        System.out.println("El nombre mas largo es: = " + max);

    }
}
