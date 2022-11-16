package org.adrian.api.stream.ejemplos.tareas;

//Calcular importe de cada producto y el gran total
// El siguiente requerimiento es para una lista de productos List<Producto> ,
// de 3 a 5 elementos, se pide calcular el importe (precio por cantidad) y sumarlos.
//La clase Producto debe tener el atributo precio del tipo double y cantidad int,
// entonces utilizando stream convertir la lista de productos en el gran total del tipo double.

import org.adrian.api.stream.ejemplos.models.Producto;

import java.util.Arrays;
import java.util.List;

public class Ej04 {
    public static void main(String[] args) {

        List<Producto> facturas = Arrays.asList(new Producto(9.99, 1), new Producto(19.99, 1.5), new Producto(4.99, 2));
        double sum = facturas.stream()
                .map(p -> p.getCantidad() * p.getPrecio())
                .reduce(0d, Double::sum);
        System.out.println(sum);

        //Forma 2:
        //List<Producto> facturas = Arrays.asList(new Producto(9.99, 1), new Producto(19.99, 1.5), new Producto(4.99, 2));
        //double sum = facturas.stream()
        //        .mapToDouble(x -> x.getCantidad() * x.getPrecio())
        //        .sum();
        //System.out.println(sum);
    }
}
