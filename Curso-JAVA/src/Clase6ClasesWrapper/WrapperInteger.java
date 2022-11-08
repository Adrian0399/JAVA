package Clase6ClasesWrapper;
public class WrapperInteger {
    public static void main(String[] args) {


        int intPrimitivo = 127;
        Integer intObjeto0 = Integer.valueOf(intPrimitivo); //COnvertir un primitivo a wrapper
        Integer intObjeto = Integer.valueOf(32768); //Forma correcta/Explicita Unboxing convierte el valor a un objeto
        Integer intObjeto2 = intPrimitivo; // Lo mismo, pero automatica, de ambas formas es correcto

        //Convertir un objeto de Int tipo Integer de referencia a un Int primitivo
        int num = intObjeto; //Toma el objeto integer y automaticamente se convierte en un primivito
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue(); //Retorna el int primivito del objeto
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto2.shortValue(); //Convertir el objeto en un short
        System.out.println("shortObjeto = " + shortObjeto); //Tener en cuenta loas cantidades que soporta cada tipo de dato
        
        Byte byteObjeto = intObjeto2.byteValue(); // -127 ~ +127
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}
