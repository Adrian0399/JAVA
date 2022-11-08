package Clase4Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 123e-7f;
        double l = 2.1313e3;
        boolean m = false;

        boolean b1 = i == j && k < l && m == false; //AND Se deben de cumplir todas las condiciones para ser TRUE
        System.out.println("b1 = " + b1);

        boolean b2 = i == j || k < l; //OR Solo con una condiicon que se cumpla es TRUE
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && (k < l || m == true);
        System.out.println("b3 = " + b3);

        boolean b4 = (i == j || k < l) && m == true;
        System.out.println("b4 = " + b4);

        boolean b5 = (true || true) && false;
        System.out.println("b5 = " + b5);

        boolean b6 = true || (false && false) || false; //true
        System.out.println("b6 = " + b6);
        
        boolean b7 = ((true || false) && false) || false; //false
        System.out.println("b7 = " + b7);

    }
}
