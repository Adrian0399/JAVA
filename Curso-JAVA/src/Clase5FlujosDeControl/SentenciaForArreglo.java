package Clase5FlujosDeControl;

import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        // String[] nombres = new String[6];
        String[] nombres = {"Adrian", "Daniel", "Lemus", "Quique", "David", "Royd"};
        int count = nombres.length; //Contador de variables dentro del arreglo
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase("Adrian") || //IgnoreCase es mejor para no tener problemas con MAYUS
                    nombres[i].equalsIgnoreCase("royd") ){
                continue;
            }
            System.out.println(i + ".- " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\" :  ");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " Fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " No fue encontrado :c");
        }

    }
}
