package org.adrian.java.jdbc;

import org.adrian.java.jdbc.modelo.Categoria;
import org.adrian.java.jdbc.modelo.Producto;
import org.adrian.java.jdbc.repositorio.CategoriaRepositorioImpl;
import org.adrian.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.adrian.java.jdbc.repositorio.Repositorio;
import org.adrian.java.jdbc.service.CatalogoServicio;
import org.adrian.java.jdbc.service.Servicio;
import org.adrian.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) throws SQLException {

        Servicio servicio = new CatalogoServicio();
        System.out.println("============= listar =============");
        servicio.listar().forEach(System.out::println);

        System.out.println("============= Insertar nueva categoria =============");
        Categoria categoria = new Categoria();
        categoria.setNombre("Iluminacion");

        System.out.println("============= insertar nuevo producto =============");
        Producto producto = new Producto();
        producto.setNombre("Lampara led escritorio");
        producto.setPrecio(990);
        producto.setFechaRegistro(new Date());
        producto.setSku("abcdefgh12");

        servicio.guardarProductoConCategoria(producto, categoria);
        System.out.println("Producto guardado con éxito: " + producto.getId());
        servicio.listar().forEach(System.out::println);


    }
}
