package org.adrian.optional.ejemplo;

import javax.swing.text.html.Option;
import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {

        String nombre = "Adrian";
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        if (opt.isPresent()){
            System.out.println("Hola " + opt.get());
        }

        System.out.println(opt.isEmpty());

        opt.ifPresent( valor -> System.out.println("Hola " + valor));

        nombre = "Jhon";
        opt = Optional.ofNullable(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());

        opt.ifPresentOrElse(valor -> System.out.println("valor = " + valor),
                () -> System.out.println("No esta presente"));


        if (opt.isPresent()){
            System.out.println("Hola " + opt.get());
        } else {
            System.out.println("No esta presente");
        }

        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println(optEmpty.isPresent());
    }
}
