package org.adrian.patrones.factory;

import org.adrian.patrones.factory.producto.PizzaNewYorkItaliana;
import org.adrian.patrones.factory.producto.PizzaNewYorkPepperoni;
import org.adrian.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {

    @Override
    PizzaProducto crearPiza(String tipo) {

        PizzaProducto producto = null;
        switch (tipo){
            case "Vegetariana":
                producto = new PizzaNewYorkVegetariana();
                break;
            case "Pepperoni":
                producto = new PizzaNewYorkPepperoni();
                break;
            case "Italiana":
                producto = new PizzaNewYorkItaliana();
                break;
        }
        return producto;
    }
}
