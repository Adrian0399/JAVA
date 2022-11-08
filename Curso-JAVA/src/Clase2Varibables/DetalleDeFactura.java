package Clase2Varibables;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura o descripcion: ");
        String nombreFactura = s.nextLine();

        System.out.println("Ingrese el precio a los productos: ");
        double precio1 = s.nextDouble();
        System.out.println("Ingrese el precio a los productos: ");
        double precio2 = s.nextDouble();

        double total = precio1 + precio2;
        double impuestos = total*0.19;
        double totalFinal = total + impuestos;

        String detalle = "\n Nombre: " + nombreFactura + "\n Total Bruto: " + total + "\n Impuestos: " + impuestos + "\n Total neto: " + totalFinal;
        System.out.println(detalle);
    }
}
