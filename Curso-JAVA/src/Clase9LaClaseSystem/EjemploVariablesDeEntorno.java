package Clase9LaClaseSystem;

import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv(); //Un HashMap en JAVA es una tabla hash basado en una implementación de la interfaz Map de Java. diccionario asociativo
        System.out.println("Variables de ambiente del sistema = " + varEnv);
        System.out.println("------ Listando variables de entorno del sistema ------");
        for (String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }

        System.out.println("Variable de ambiente del sistema = " + varEnv);
    
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        
        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        String path2 = varEnv.get("path");
        System.out.println("path2 = " + path2);

        String appEnv = varEnv.get("APPLICATION_ENV");
        System.out.println("path = " + path);

        String hola = varEnv.get("SALUDAR_HOLA");
        System.out.println("path = " + path);

    }
}
