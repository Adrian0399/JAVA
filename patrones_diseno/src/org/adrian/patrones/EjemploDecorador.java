package org.adrian.patrones;

import org.adrian.patrones.decorator.Formateable;
import org.adrian.patrones.decorator.Texto;
import org.adrian.patrones.decorator.decorador.MayusculaDecorador;
import org.adrian.patrones.decorator.decorador.ReemplazarEspaciosDecorador;
import org.adrian.patrones.decorator.decorador.ReversaDecorador;
import org.adrian.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Adrian !");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(mayuscula);
        ReemplazarEspaciosDecorador remplazar = new ReemplazarEspaciosDecorador(subrayar);

        System.out.println(remplazar.darFormato());

    }
}
