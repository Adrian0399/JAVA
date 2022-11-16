package org.adrian.hilos.ejemploexecutor;

import org.adrian.hilos.ejemplosync.Panaderia;
import org.adrian.hilos.ejemplosync.runnable.Consumidor;
import org.adrian.hilos.ejemplosync.runnable.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorProductorConsumidor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3); //Minimo 2, porque se trabajan de manera sincronizada

        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getPoolSize());

        Panaderia p = new Panaderia();
        Runnable productor = new Panadero(p);
        Runnable consumidor = new Consumidor(p);

        Future<?> futuro1 = executor.submit(productor);
        Future<?> futuro2 = executor.submit(consumidor);

        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getPoolSize());

        executor.shutdown();
        System.out.println("Continuando con la ejecución del método Main 1");

    }
}
