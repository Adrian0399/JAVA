package org.adrian.archivos.ejemplos;

import org.adrian.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "C:\\Users\\adolvera\\Desktop\\Archivo\\java.txt";
        ArchivoServicio servicio = new ArchivoServicio();

        System.out.println(servicio.leerArchivo2(nombreArchivo));
    }
}
