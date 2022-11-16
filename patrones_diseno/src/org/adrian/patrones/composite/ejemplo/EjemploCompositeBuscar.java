package org.adrian.patrones.composite.ejemplo;

import org.adrian.patrones.composite.Archivo;
import org.adrian.patrones.composite.Directorio;

public class EjemploCompositeBuscar {
    public static void main(String[] args) {

        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("Patron-composite.docx"));
        Directorio stream = new Directorio("API Stream");
        stream.addComponente(new Archivo("Stream-map.docx"));

        java.addComponente(stream);
        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpeg"));

        boolean encontrado = doc.buscar("Patron-composite.docx");
        System.out.println("Encontrado \"Patron-composite.docx\": " + encontrado);

        encontrado = doc.buscar("Api Stream");
        System.out.println("Encontrado Api Stream: " + encontrado);

        encontrado = doc.buscar("c1v.docdx");
        System.out.println("Encontrado cv.docx: " + encontrado);

    }
}
