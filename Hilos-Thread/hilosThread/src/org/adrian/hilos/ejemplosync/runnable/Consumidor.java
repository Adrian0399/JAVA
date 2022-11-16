package org.adrian.hilos.ejemplosync.runnable;
//Panadero y Consumidor tienen en comun el mismo atributo, que es panaderia
//es el objeto MONITOR con los metodos sincronizados. ´Por lo tanto los 2 entran a este metodo
//uno para producir y otro para consumir, notiicando cuando uno termina su tarea.
//De manera sincronizada con el metodo synchronized


import org.adrian.hilos.ejemplosync.Panaderia;

public class Consumidor implements Runnable{

    private Panaderia panderia;

    public Consumidor(Panaderia panderia) {
        this.panderia = panderia;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            panderia.consumir();
        }
    }
}
