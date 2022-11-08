package Clase2Varibables;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un Número entero"); //Ventana emergente

        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr); //Convertir String a INT
        } catch (NumberFormatException e){ //AL ingresar un valor no valido sale la exepcion que se debe de evitar "NumberFormatException"
            JOptionPane.showMessageDialog(null, "Debe de ingresar un numero entero");
            main (args); //Invocar metodo MAIN con sus argumentos
            System.exit(0); //Nos salimos del catch con status 0 para no tener error
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100; //0b Binario
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "Numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 0764; //O Octal
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero Hexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        int numeroHex = 0x1f4; //0x Hexadecimal
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
