package org.adrian.hilos.ejemplosync.runnable;
//Panadero y Consumidor tienen en comun el mismo atributo, que es panaderia
//es el objeto MONITOR con los metodos sincronizados. ´Por lo tanto los 2 entran a este metodo
//uno para producir y otro para consumir, notiicando cuando uno termina su tarea.
//De manera sincronizada con el metodo synchronized

import org.adrian.hilos.ejemplosync.Panaderia;

import java.util.concurrent.ThreadLocalRandom;

public class Panadero implements Runnable{

    private Panaderia panderia;

    public Panadero(Panaderia panderia) {
        this.panderia = panderia;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            panderia.hornear("Pan n=: " + i);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
