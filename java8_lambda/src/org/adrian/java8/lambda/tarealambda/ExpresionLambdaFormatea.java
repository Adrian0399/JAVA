package org.adrian.java8.lambda.tarealambda;

public class ExpresionLambdaFormatea {

    public static void main(String[] args) {
        
        FormatearFrase format = frase -> {
            return  frase.replace(".", "")
                    .replace(",", "").replace(" ", "")
                    .toUpperCase();
        };
        
        String resultado = format.eliminarEspacionBlanco("Adrian Olvera Ordoñez, encontro trabajo como practicante y esta estudiando con este curso para ser Jr.");
        System.out.println("resultado sin espacio = " + resultado);
        
    }
}
