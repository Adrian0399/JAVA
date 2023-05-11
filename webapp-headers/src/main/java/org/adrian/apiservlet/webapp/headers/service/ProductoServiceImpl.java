package org.adrian.apiservlet.webapp.headers.service;

import org.adrian.apiservlet.webapp.headers.models.Producto;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProductoServiceImpl implements ProductoService{

    @Override
    public List<Producto> listr() {
        return Arrays.asList(new Producto(1L, "Notebook", "Computacion", 25000),
            new Producto(2L, "Mesa Escritorio", "Oficina", 3000),
            new Producto(3L, "Teclado mecanico", "Computacion", 2000));

    }

    @Override
    public Optional<Producto> buscarProducto(String nombre) {
        return listr().stream().filter(p ->{
            if (nombre == null || nombre.isBlank()){
                return false;
            }
            return p.getNombre().contains(nombre);
        }).findFirst();
    }
}
