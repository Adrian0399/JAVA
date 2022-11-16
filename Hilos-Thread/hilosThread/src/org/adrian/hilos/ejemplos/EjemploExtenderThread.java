package org.adrian.hilos.ejemplos;

import org.adrian.hilos.ejemplos.thread.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("Adrian Olvera");
        hilo.start(); //Inicio
        // Thread.sleep(1); //Pausa para el metodo main
        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();
        System.out.println(hilo.getState());

        Thread hilo3 = new NombreThread("Pepe");
        hilo3.start();
        System.out.println(hilo.getState());
    }

}
