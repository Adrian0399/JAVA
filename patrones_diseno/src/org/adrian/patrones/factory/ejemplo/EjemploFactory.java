package org.adrian.patrones.factory.ejemplo;

import org.adrian.patrones.factory.PizzaProducto;
import org.adrian.patrones.factory.PizzeriaCaliforniaFactory;
import org.adrian.patrones.factory.PizzeriaNewYorkFactory;
import org.adrian.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("Queso");
        System.out.println("Adrian prodena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("Pepperoni");
        System.out.println("Daniel ordena la pizza " + pizza.getNombre());

        pizza = california.ordenarPizza("Vegetariana");
        System.out.println("Juan Pablo ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("Vegetariana");
        System.out.println("Quique ordena la pizza " + pizza.getNombre());

        pizza = california.ordenarPizza("Pepperoni");
        System.out.println("David ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);
    }
}
