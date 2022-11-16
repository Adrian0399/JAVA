package org.adrian.patrones.factory.producto;

import org.adrian.patrones.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza California Queso";
        masa = "Masa a la piedra delgada";
        salsa = "Salsa de tomate rucula";
        ingredientes.add("Extra Queso Mozarrella");
        ingredientes.add("Cebolla");
        ingredientes.add("QuesoAzul");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando durante 30 min. a 100°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños tringualos");
    }
}
