package org.adrian.optional.ejemplo;

import org.adrian.optional.ejemplo.models.Computador;
import org.adrian.optional.ejemplo.models.repositorio.ComputadorRepositorio;
import org.adrian.optional.ejemplo.models.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodosOrElseThrow {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();


        Computador pc = repositorio.filtrar("asus").orElseThrow(IllegalStateException::new);
        System.out.println(pc);

        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println(extension);

    }
}
