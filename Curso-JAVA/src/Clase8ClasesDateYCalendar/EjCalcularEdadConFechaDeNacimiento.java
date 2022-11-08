package Clase8ClasesDateYCalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjCalcularEdadConFechaDeNacimiento {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una fecha de nacimiento con el formato yyyy-MM-dd");
        String fechaStr = s.next();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimiento = df.parse(fechaStr);
        Date actual = new Date();

        //Creamos un patron de fecha numerico con el año mes y dia
        df = new SimpleDateFormat("yyyyMMdd");

        //Convertir ambas fechas, la actual y fecha de nacimiento en enteros que contiene el año mes y dia
        int desde = Integer.parseInt(df.format(fechaNacimiento));
        int hasta = Integer.parseInt(df.format(actual));

        //Luego restamos ambas fechas y dividimos en 10,000 para quitar decimales y dejar la fecha en decenas o centenas
        int edad = (hasta - desde) / 10000;
        System.out.println("La edad es: " + edad);
    }
}
