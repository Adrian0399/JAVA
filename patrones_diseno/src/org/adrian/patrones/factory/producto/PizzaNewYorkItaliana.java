package org.adrian.patrones.factory.producto;

import org.adrian.patrones.factory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {

    public PizzaNewYorkItaliana() {
        nombre = "Pizza Italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa de Tomate italiano carne";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamon");
        ingredientes.add("Chorizo");
        ingredientes.add("Champinones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 minutos a 120°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos grandes");
    }
}
