package org.adrian.patrones.factory;

import org.adrian.patrones.factory.producto.PizzaCaliforniaPepperoni;
import org.adrian.patrones.factory.producto.PizzaCaliforniaQueso;
import org.adrian.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPiza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "Queso":
                producto = new PizzaCaliforniaQueso();
                break;
            case "Pepperoni":
                producto = new PizzaCaliforniaPepperoni();
                break;
            case "Vegetariana":
                producto = new PizzaCaliforniaVegetariana();
                break;
        }
        return producto;
    }
}
