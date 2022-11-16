package org.adrian.hilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executor = Executors.newSingleThreadScheduledExecutor();


        Callable<String> tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea...");
            return "Algun resultado importante de la tarea";
        };
        Future<String> resultado = executor.submit(tarea);
        executor.shutdown();
        System.out.println("Continuando con la ejecución del método Main 1");

        //System.out.println(resultado.isDone());
        while (!resultado.isDone()) {
            System.out.println("ejecutando tarea ...");
            TimeUnit.MILLISECONDS.sleep(1500);
        }
        //System.out.println(resultado.get(5, TimeUnit.SECONDS)); //Tiempo de espera para realizar la tarea
        System.out.println("Obtenemos resultado de la tarea" + resultado.get());
        System.out.println(resultado.isDone());




    }
}
