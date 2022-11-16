package org.adrian.java8.lambda;

import org.adrian.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {
        //Consumer es una expresion lambda que nos permite pasar por argumento un solo parametro dle tipo generico, se puede pasar lo que sea


        //Consumer<String> consumidor = saludo -> System.out.println(saludo);
        //Consumer<String> consumidor = saludo -> {
        //    System.out.println(saludo);
        //};

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        consumidor.accept(new Date());
        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre + ", tiene " + edad + " años!");
        consumidorBi.accept("pepe", 20);

        Consumer<String> consumidor2 = System.out::println;

        consumidor2.accept("Hola mundo lambda");

        List<String> nombres = Arrays.asList("Andres", "Adrian", "Daniel", "Quique", "Juan Pablo");
        nombres.forEach(consumidor2);

        Supplier<Usuario> crearUsuario = Usuario::new; //Simplificacion de referencia de metodo con :: como referencia de metodo, Expresion lambda que crea un objeto
        Usuario usuario = crearUsuario.get();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "Andrés");
        System.out.println("Nombre usuario: " + usuario.getNombre());

        Supplier<String> proveedor = () -> "Hola Mundo lambda supplier";

        System.out.println(proveedor.get());


    }


}
