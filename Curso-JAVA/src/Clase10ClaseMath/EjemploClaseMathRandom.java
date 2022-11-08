package Clase10ClaseMath;

import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};

        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length; //Imprimir random*7
        System.out.println("random = " + random);
        
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]); //[random] pide un int, se hace un cast por un int

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(99); // () vacio Para ir desde -2^31 ~ +2^32
        //int randomInt = randomObj.nextInt();
        //int randomInt = randomObj.nextInt(25-15);
        //int randomInt = randomObj.nextInt(25-15+1);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
