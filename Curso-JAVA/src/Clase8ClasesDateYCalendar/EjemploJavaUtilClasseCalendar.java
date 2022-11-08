package Clase8ClasesDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilClasseCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance(); //Clase abstracta, no permite crear con new

        //calendario.set(1999, Calendar.AUGUST, 03, 19, 40, 10);
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.AUGUST);
        calendario.set(Calendar.DAY_OF_MONTH, 03);
        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.AM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 99);
        //calendario.set(Calendar.HOUR, 10);
        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);

        //SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd ~ HH:mm:ss:SSS");
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd ~ hh:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);
    }
}
