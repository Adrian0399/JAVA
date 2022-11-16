package org.adrian.patrones.composite.ejemplo;

import org.adrian.patrones.composite.Archivo;
import org.adrian.patrones.composite.Directorio;

public class EjemploComposite {
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

        System.out.println(doc.mostrar(0));

    }
}
