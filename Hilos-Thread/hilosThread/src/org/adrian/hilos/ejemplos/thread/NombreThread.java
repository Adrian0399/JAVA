package org.adrian.hilos.ejemplos.thread;

public class NombreThread extends Thread{
    public NombreThread(String name) { //Constructor para dar un nombre
        super(name);
    }

    @Override
    public void run() { //MEtodo run, para un principio y un final
        System.out.println("Se inicia el método Run del hilo " + getName());

        for (int i =0; i<10; i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getName());
        }
        System.out.println("Finaliza el hilo");
    }
}
