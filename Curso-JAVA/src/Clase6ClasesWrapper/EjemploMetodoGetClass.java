package Clase6ClasesWrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        
        String texto = "Hola que tal";
        
        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName()); //Imprime el nombre con el package
        System.out.println("strClass.getName() = " + strClass.getSimpleName()); //Imprime sin el package
        System.out.println("strClass.getName() = " + strClass.getPackageName()); //Imprime el package
        System.out.println("strClass = " + strClass); //Imprime todo, pero primero antepone "class"

        for (Method metodo: strClass.getMethods()){ //For para imprimir todos los metodos
            System.out.println("metodo = " + metodo.getName()); //Metodo es un objeto, pero con .getname se imprime el nombre del objeto
        }
        
        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass());
        System.out.println("intClass.getSuperclass().getSuperclass() = " + objClass);

        for (Method metodo: objClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }

    }
}
