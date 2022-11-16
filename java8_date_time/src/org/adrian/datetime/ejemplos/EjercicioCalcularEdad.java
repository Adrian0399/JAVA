package org.adrian.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EjercicioCalcularEdad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese una fecha de nacimiento con formato yyyy-MM-dd");
        String fechaStr = s.next();

        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate actual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, actual);
        System.out.printf("Tu edad es: %s años, %s meses y %sdias", periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}
