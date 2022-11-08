package Clase3Strings;

public class StringExtensionArchivoEjemplo {
    public static void main(String[] args) {
        
        String archivo = "Alguna im.agen.jpeg";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(i) = " + archivo.substring(i));
        System.out.println("archivo.substring(i) = " + archivo.substring(i+1));

        //

    }
}
