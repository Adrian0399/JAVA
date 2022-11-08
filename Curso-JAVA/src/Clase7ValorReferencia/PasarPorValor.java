package Clase7ValorReferencia;

public class PasarPorValor {
    public static void main(String[] args) {

        // int i = 10;
        Integer i = 10;
        System.out.println("Iniciamos el método main con i = " + i);
        test(i); //Invocamos al metodo main
        System.out.println("Finaliza el método main con el valor de i (Se mantiene igual) = " + i);
    }

    public static void test(Integer i){ //Metodo estatico //void no devuelve ningun valor
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finaliza el metodo test con i = " + i);
    }
}
