package Clase4Operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "Creando un objeto de la clase String ... Hello!";

        Integer num = 7;

        Boolean b1 = texto instanceof String; //Para utilizar InstanceOf deben de ser del tipo referencia
        // boolean b1 = texto instanceof Object; //Todos los tipos, clases, objetos son del tipo Object porque heredan
        System.out.println("Texto es del tipo String = " + b1);

        b1 = texto instanceof Object; //Todos los tipos, clases, objetos son del tipo Object porque heredan
        System.out.println("Texto es del tipo String = " + b1);

        b1 = num instanceof Integer;
        System.out.println("Numero es del tipo INTEGER " + b1);

        b1 = num instanceof Number; //Number es padre , donde las clases de tipo heredan de ella
        System.out.println("Numero es del tipo INTEGER " + b1);

        b1 = num instanceof Object; //Todo objeto, es del tipo Object
        System.out.println("Numero es del tipo INTEGER " + b1);

        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("decimal  es del tipo Number = " + b1);
        
        b1 = b1 instanceof Boolean;
        System.out.println("b1 = " + b1);

    }
}
