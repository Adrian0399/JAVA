package org.adrian.api.stream.ejemplos;

import org.adrian.api.stream.ejemplos.models.Factura;
import org.adrian.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario user1 = new Usuario("Jhon", "Doe");
        Usuario user2 = new Usuario("Pepe", "Perez");

        user1.addFactura(new Factura("Compras tecnologia"));
        user1.addFactura(new Factura("Compras muebles"));

        user2.addFactura(new Factura("Bicicleta"));
        user2.addFactura(new Factura("Notebook"));

        List<Usuario> usuarios = Arrays.asList(user1, user2);
        usuarios.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ")
                .concat(f.getUsuario().toString())));

        /* for (Usuario u: usuarios){
            for (Factura f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        } */

    }
}
