package Clase2Varibables;

public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo Byte  corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo Byte  corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor maximo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short  corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo shor  corresponde en bites a " + Short.SIZE);
        System.out.println("Valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor maximo de un short: " + Short.MIN_VALUE);

        int numeroInt =  2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo INT  corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo INT  corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor maximo de un INT: " + Integer.MAX_VALUE);
        System.out.println("Valor maximo de un INT: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo Long  corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo Long  corresponde en bites a " + Long.SIZE);
        System.out.println("Valor maximo de un Long: " + Long.MAX_VALUE);
        System.out.println("Valor maximo de un Long: " + Long.MIN_VALUE);

        float numeroFloat = 9223372036854775808F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Tipo Float  corresponde en byte a " + Float.BYTES);
        System.out.println("Tipo Float  corresponde en bites a " + Float.SIZE);
        System.out.println("Valor maximo de un Float: " + Float.MAX_VALUE);
        System.out.println("Valor maximo de un Float: " + Float.MIN_VALUE);

        double numeroDouble = 9223372036854775808F;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Tipo Double  corresponde en byte a " + Double.BYTES);
        System.out.println("Tipo Double  corresponde en bites a " + Double.SIZE);
        System.out.println("Valor maximo de un Double: " + Double.MAX_VALUE);
        System.out.println("Valor maximo de un Double: " + Double.MIN_VALUE);

        var numeroVar = 9223372036854775808F;
        // var Puede soportar cualquier tamaño siempre seria INT hasta el valor de 2147483647, despues habra que convertir a los posteriores

    }
}
