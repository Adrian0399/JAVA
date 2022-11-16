package org.adrian.datetime.ejemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaTiempo = LocalDateTime.now();
        System.out.println("fechaTiempo = " + fechaTiempo);
        
        fechaTiempo = LocalDateTime.of(2020, Month.AUGUST, 03, 10 , 45, 59);
        System.out.println("fechaTiempo = " + fechaTiempo);
        
        fechaTiempo = LocalDateTime.parse("2022-11-10T09:50:00");
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = fechaTiempo.plusDays(1).plusHours(2).plusMinutes(30);
        System.out.println("fechaTiempo = " + fechaTiempo);

        System.out.println("fechaTiempo2 = " + fechaTiempo.minusHours(5));

        Month mes = fechaTiempo.getMonth();
        System.out.println("mes = " + mes);

        int dia = fechaTiempo.getDayOfMonth();
        System.out.println("dia: " + dia);

        int anio = fechaTiempo.getYear();
        System.out.println("anio: " + anio);

        String formato1 = fechaTiempo.format(DateTimeFormatter.ISO_DATE);
        System.out.println("formato1 = " + formato1);

        String formato2 = fechaTiempo.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("formato1 = " + formato2);

        String formato3 = fechaTiempo.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println("formato2 = " + formato3);




    }
}
