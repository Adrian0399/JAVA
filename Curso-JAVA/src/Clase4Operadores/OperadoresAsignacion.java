package Clase4Operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {

        int i = 5;
        System.out.println("i = " + i);
        int j = i + 4;
        System.out.println("j = " + j);

        i += 2; // i = i + 2
        System.out.println("i = " + i);

        i += 5; // i = i + 5
        System.out.println("i = " + i);
        
        j -= 4; // j = j - 4
        System.out.println("j = " + j);
        
        j *= 3; // j = j * 3
        System.out.println("j = " + j);

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre='Adrian'";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = " + sqlString);

    }
}
