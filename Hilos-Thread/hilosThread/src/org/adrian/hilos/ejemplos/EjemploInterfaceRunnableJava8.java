package org.adrian.hilos.ejemplos;

import org.adrian.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {

        Thread main = Thread.currentThread();
        Runnable viaje = () -> {
                for(int i=0; i<10; i++){
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((long)(Math.random() * 1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Finalmente me voy de viaje a: " + Thread.currentThread().getName());
                System.out.println(main.getState()); //WAITING
        };


        Thread v1 = new Thread(viaje, "Canada");
        Thread v2 =new Thread(viaje ,"Cancun");
        Thread v3 =new Thread(viaje, "Acapulco");
        Thread v4 =new Thread(viaje, "Cabo San Lucas");

        //Thread.sleep(10000);
        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v1.join();
        v2.join();
        v3.join();
        v4.join();
        System.out.println("Continuando con la ejecución del método main: " + main.getName());
    }
}
