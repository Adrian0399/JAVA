package org.adrian.patrones.factory;

abstract public class PizzeriaZonaAbstractFactory {

    public PizzaProducto ordenarPizza(String tipo){
        PizzaProducto pizza = crearPiza(tipo);
        System.out.println("--- Fabricando la pizaa " + pizza.getNombre() + " --- ");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract PizzaProducto crearPiza(String tipo);

}
