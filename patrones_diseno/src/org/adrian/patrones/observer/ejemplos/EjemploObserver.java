package org.adrian.patrones.observer.ejemplos;

import org.adrian.patrones.observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {

        Corporacion google = new Corporacion("Google", 1000);
        google.addObserver((observable, obj) -> {
            System.out.println("Adrian: " +  observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Daniel: " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Quique: " + observable);
        });

        google.modificaPrecio(5000);

    }
}
