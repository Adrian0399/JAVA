package org.adrian.optional.ejemplo;

import org.adrian.optional.ejemplo.models.Computador;
import org.adrian.optional.ejemplo.models.repositorio.ComputadorRepositorio;
import org.adrian.optional.ejemplo.models.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        // Computador defecto = new Computador("Hp Omen", "LA842");

        Computador pc = repositorio.filtrar("asus").orElse(valorDefecto()); //orElse siempre crea el valor por defecto
        System.out.println(pc);

        pc = repositorio.filtrar("macbo21ok").orElseGet(EjemploRepositorioMetodosOrElse::valorDefecto);
        System.out.println(pc);
    }

    public static Computador valorDefecto(){
        System.out.println("Obteniendo el valor por defecto!!!");
        return new Computador("Hp Omen", "LA842");
    }
}
