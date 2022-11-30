package org.adrian.apiservlet.webapp.headers.service;

import org.adrian.apiservlet.webapp.headers.models.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    List<Producto> listr();

    Optional<Producto> buscarProducto(String nombre);

    Optional<Producto> porId(Long id);

}
