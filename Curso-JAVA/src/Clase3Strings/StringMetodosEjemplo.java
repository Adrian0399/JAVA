package Clase3Strings;

public class StringMetodosEjemplo {

    public static void main(String[] args) {
        String nombre = "Adrian";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Adrian\") = " + nombre.equals("Adrian"));
        System.out.println("nombre.equals(\"adrian\") = " + nombre.equals("adrian"));
        System.out.println("nombre.equalsIgnoreCase() = " + nombre.equalsIgnoreCase("adrian"));
        System.out.println("nombre.compareTo(\"Adrian\") = " + nombre.compareTo("Adrian"));
        System.out.println("nombre.compareTo(\"Daniel\") = " + nombre.compareTo("Daniel"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.charAt(nombre.length()-4) = " + nombre.charAt(nombre.length()-4));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(0) = " + nombre.substring(0));

        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(4, 6));
        System.out.println("nombre.substring(5) = " + nombre.substring(5));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));



    }

}
