package Clase9LaClaseSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Executable;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado");

            System.setProperties(p);
            System.getProperties().list(System.out);

            //Properties ps = System.getProperties();
            //ps.list(System.out);
        } catch (Exception e){
            System.err.println("No existe el archivo = " + e);
            System.exit(1); //Manejo de errores
        }
    }
}
