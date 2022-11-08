package Clase6ClasesWrapper;

public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2; //Objetos de referencia
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; //False
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("False");
        Boolean objBoolean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);


        System.out.println("Comparando dos obetos boolean: " + (objBoolean == objBoolean2));
        System.out.println("Comparando dos obetos boolean: " + (objBoolean.equals(objBoolean2)));
        System.out.println("Comparando dos obetos boolean: " + (objBoolean2 == objBoolean3));
        System.out.println("Comparando dos obetos boolean: " + (objBoolean == objBoolean3));

        boolean primBoolean2 = objBoolean2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);
    }
}
