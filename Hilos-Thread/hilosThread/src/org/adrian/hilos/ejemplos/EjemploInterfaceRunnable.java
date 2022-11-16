package org.adrian.hilos.ejemplos;

import org.adrian.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {

        new Thread(new ViajeTarea("Canada")).start();
        new Thread(new ViajeTarea("Cancun")).start();
        new Thread(new ViajeTarea("Acapulco")).start();
        new Thread(new ViajeTarea("Cabo San Lucas")).start();

    }
}
