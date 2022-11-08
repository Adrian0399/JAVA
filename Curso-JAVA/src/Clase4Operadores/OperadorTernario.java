package Clase4Operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //Operador ternario = Formado por 3 argumentos, donde la primera evalua una expresion booleana (Version simplificada del if else)
        // variable = condicion ? si es verdadero: si es falso;

        String variable = 7 == 4 ? "Si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);


        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematicas");
        matematicas = s.nextDouble();
        System.out.println("Ingrese la nota de ciencias");
        ciencias = s.nextDouble();
        System.out.println("Ingrese la nota de historia");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 5.49 ? "Aprobado": "Rechazado";
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);

                /* if(promedio >= 5.49){
                    estado = "Aprobado";
                } else {                        //Mas lineas que con operador terniario
                    estado = "Rechazado";
                } */


    }
}
