package Clase4Operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre Incremento
        int i = 1;
        System.out.println("i = " + i);
        int j = ++i; // i = i + 1 // Incrementa al momento que le asigna el valor a j
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post incremento
        System.out.println("Post incremento");
        i = 2;
        System.out.println("i = " + i);
        j = i++; //Se incrementa despues de j, que se queda en 2, e i aumenta a 3, pero no afecta a j en 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre decremento
        System.out.println("Pre decremento");
        i = 3;
        j = --i; // Decrementa 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post decremento
        System.out.println("Post decremento");
        i = 4;
        j = i--; // Decrementa despues de j, que se queda con 3, e i se disminuye en 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);


    }
}
