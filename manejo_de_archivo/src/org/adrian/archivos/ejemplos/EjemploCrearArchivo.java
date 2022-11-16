package org.adrian.archivos.ejemplos;

import org.adrian.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "C:\\Users\\adolvera\\Desktop\\Archivo\\java.txt";

        ArchivoServicio servicie = new ArchivoServicio();
        servicie.crearArchivo2(nombreArchivo);
    }
}
