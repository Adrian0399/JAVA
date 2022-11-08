package Clase4Operadores;

import java.util.Scanner;

public class OperadorTernarioLogin {
    public static void main(String[] args) {

        /* String[] usernames = new String[3]; //Un arreglo es JAVA es del tipo de refrencia, un objeto una instancia
        String[] passwords = new String[3];

        usernames[0] = "Adrian";
        passwords[0] = "Kaibil57";

        usernames[1] = "Admin";
        passwords[1] = "Admin99";

        usernames[2] = "Dev";
        passwords[2] = "Dev01"; */

            String[] usernames = {"Adrian", "Admin", "Dev"}; //Arreglo se inician con una cantidad explicita de elementos
            String[] passwords = {"Kaibil57", "Admin99", "Dev01"};

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el username");
            String usuario = scanner.next();

            System.out.println("Ingrese el password");
            String pass = scanner.next();

            boolean esAutenticado = false;

            for(int i = 0; i < usernames.length; i++){
                esAutenticado = (usernames[i].equals(usuario) && passwords[i].equals(pass))? true: esAutenticado;

                /* if( usernames[i].equals(usuario) && passwords[i].equals(pass) ){
                    esAutenticado = true;
                    break; //Salir del for para no continuar iterando o mostrar el msj de abajo
                }else{
                    System.out.println("Ussername o contraseña incorrectos");
                    break;
                } */
            }

            String mensaje = esAutenticado? "Bienvenido usuario ".concat(usuario).concat("!") : "Username o contraseña incorrectos! \n Lo siento, requiere autenticación";
            System.out.println("mensaje = " + mensaje);
            /* if (esAutenticado) {
                System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
            } else {
                System.out.println("Lo siento, requiere autenticación");
            } */

    }
}
