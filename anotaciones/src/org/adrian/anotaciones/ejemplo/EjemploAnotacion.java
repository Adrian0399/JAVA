package org.adrian.anotaciones.ejemplo;

import org.adrian.anotaciones.ejemplo.models.Producto;
import org.adrian.anotaciones.ejemplo.procesador.JsonSerializador;

import java.time.LocalDate;


public class EjemploAnotacion {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa de centro ROBLE");
        p.setPrecio(1000L);

        System.out.println("json = " + JsonSerializador.convertirJson(p));
    }
}