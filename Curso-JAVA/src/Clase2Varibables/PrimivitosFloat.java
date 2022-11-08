package Clase2Varibables;

public class PrimivitosFloat {

    public static void main(String[] args) {
        float realFloat = 1.5e4f; //15000f;
        System.out.println("realFloat = " + realFloat);

        float realFloat2 = 0.00000000015f; //1.5E-10
        System.out.println("realFloat2 = " + realFloat2);
        System.out.println("Float corresponde en byte a = " + Float.BYTES);
        System.out.println("Float corresponde en bites a = " + Float.SIZE);
        System.out.println("Maximo valor para Float = " + Float.MAX_VALUE);
        System.out.println("Minimo valor para Float = " + Float.MIN_VALUE);

        double realDoble = 3.4028235E38;
        System.out.println("realDoble = " + realDoble);
        System.out.println("Double corresponde en byte a = " + Double.BYTES);
        System.out.println("Double corresponde en bites a = " + Double.SIZE);
        System.out.println("Maximo valor para Double = " + Double.MAX_VALUE);
        System.out.println("Minimo valor para Double = " + Double.MIN_VALUE);

        float varFlotante = 3.1416f; //3; //3.1416f; (float) // 3.1416d (double) //
        System.out.println("varFlotante = " + varFlotante);

    }
}
