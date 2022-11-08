package Clase4Operadores;

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String ... Hello!";

        Number num = Integer.valueOf(7); //Forma correcta de crear una instancia, ValueOf retorna es un tipo Integer (Tipo de referencia, no es muy malo primitivo)          //7;

        Boolean b1 = texto instanceof String; //Para utilizar InstanceOf deben de ser del tipo referencia
        // boolean b1 = texto instanceof Object; //Todos los tipos, clases, objetos son del tipo Object porque heredan
        System.out.println("Texto es del tipo String = " + b1);

        b1 = texto instanceof Object; //Todos los tipos, clases, objetos son del tipo Object porque heredan
        System.out.println("Texto es del tipo String = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("El texto es del tipo Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("Num es del tipo INTEGER = " + b1);

        b1 = num instanceof Number; //Number es padre , donde las clases de tipo heredan de ella
        System.out.println("Num es del tipo Number = " + b1);

        b1 = num instanceof Object; //Todo objeto, es del tipo Object
        System.out.println("Num es del tipo Object = " + b1);

        b1 = num instanceof Long;
        System.out.println("Num es del tipo LONG = " + b1);

        b1 = num instanceof Double;
        System.out.println("Num es del tipo Double = " + b1);

        Number decimal = 45.54f;
        //Number decimal = Float.valueOf(45.54f);
        //Number decimal = Double.valueOf(45.54);
        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer = " + b1);


        b1 = decimal instanceof Number;
        System.out.println("decimal  es del tipo Number = " + b1);
        
        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo boolean = " + b1);

    }
}
