package org.adrian.poointerfaces.repositorio;

import org.adrian.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
