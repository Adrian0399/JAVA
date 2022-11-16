package org.adrian.java8.lambda;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.adrian.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {

    public static void main(String[] args) { //Ejemplo Expresionas booleanas con expresiones lambda
 
        Predicate<Integer> test = num -> num > 10;
        boolean resul = test.test(7);
        System.out.println("resul = " + resul);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(t2.test("ROLE_ADMIN"));

        BiPredicate<String, String> t3 = String::equals; //(a, b) -> a.equals(b);
        System.out.println(t3.test("Adrian", "Adrian"));
        BiPredicate<Integer, Integer> t4 = (i, j) -> j > i;
        boolean r2 = t4.test(5, 10);
        System.out.println(r2);

        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("Maria");
        b.setNombre("Maria");
        BiPredicate<Usuario, Usuario> t5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println(t5.test(a, b));
        }
    }
