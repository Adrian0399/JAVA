package Clase2Varibables;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un Número entero: ");
        // String numeroStr = scanner.nextLine(); //NextLine espera la entrada del valor para convertirlo la variable
        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr); //Convertir String a INT
        } catch (InputMismatchException e){ //AL ingresar un valor no valido sale la exepcion que se debe de evitar "InputMismatchException"
            System.out.println("Error, debe de ingresar un numero entero!");
            main (args); //Invocar metodo MAIN con sus argumentos
            System.exit(0); //Nos salimos del catch con status 0 para no tener error
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "Numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHex = "numero Hexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;
        System.out.println(mensaje);;
    }
}
