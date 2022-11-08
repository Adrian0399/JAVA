import java.util.Locale;

public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola Mundo, que tal. Estoy aprendiendo JAVA";
        System.out.println(saludar);
        System.out.println("saludarM = " + saludar.toUpperCase());

        Integer numero = 11;

        boolean valor = true;
        int numero2 = 5;
        if (valor){
            System.out.println("numero = " + numero);
            numero2 = 2;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "15";


        String nombre;
        nombre = "Adrian";

        if(numero > 10){
            nombre = "Estrella";
        }
        System.out.println("nombre = " + nombre);

        int edad = 23;

    }
}
