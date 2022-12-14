package org.adrian.patrones.decorator2;

import org.adrian.patrones.decorator2.decoradores.ConChocolateDecorador;
import org.adrian.patrones.decorator2.decoradores.ConCremaDecorador;
import org.adrian.patrones.decorator2.decoradores.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {

        Configurable cafe = new Cafe("Cafe Mocha", 7);
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChocolate = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del cafe moca es: " + conChocolate.getPrecioBase());
        System.out.println("Los ingredeintes: " + conChocolate.getIngredientes());

        Configurable capuchino = new Cafe("Cafe capuchino", 4);
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("El precio del capuchino es: " +conCrema.getPrecioBase());
        System.out.println("Los ingredientes son: " + conLeche.getIngredientes());

        Configurable expreso = new Cafe("Cafe Espresso", 3);
        System.out.println("El precio del cafe expreso es: " + expreso.getPrecioBase());
        System.out.println("Los ingredientes son: " + conLeche.getIngredientes());
    }

}
