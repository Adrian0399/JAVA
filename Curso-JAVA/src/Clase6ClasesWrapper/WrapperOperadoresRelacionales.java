package Clase6ClasesWrapper;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000); //Forma explicita
        Integer num2 = num1; //Forma implicita (Automatica)

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));


        num2 = 1000; //Este ya es otra instancia, se le asigno otro objeto
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        System.out.println("Tinen el mismo valor? " + (num1.equals(num2))); //equals compara valores en tipos de referencia
        System.out.println("Tinen el mismo valor? " + (num1.intValue() == num2.intValue())); //Compara primitivos

        num2 = 500;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);//Son iguales en valor, pero no en instancia por eso es FALSE

        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("condicion2 = " + condicion2);
        
    }
}
