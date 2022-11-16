package org.adrian.optional.ejemplo;

import org.adrian.optional.ejemplo.models.Computador;
import org.adrian.optional.ejemplo.models.Fabricante;
import org.adrian.optional.ejemplo.models.Procesador;
import org.adrian.optional.ejemplo.models.repositorio.ComputadorRepositorio;
import org.adrian.optional.ejemplo.models.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "amd".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");
        System.out.println(f);

    }


}
