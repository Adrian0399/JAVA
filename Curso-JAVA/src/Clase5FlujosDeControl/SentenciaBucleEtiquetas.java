package Clase5FlujosDeControl;

public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        //Dar etiqueta al for
        for (int i = 1; i < 7; i++) {
            int j = 1;
            while (j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia = " + i + ": Descanso de fin de semana");
                    continue bucle1;
                }
                System.out.println("Dia " + i + ", trabajando a las " + j + "hrs. ");
                j++;
            }
        }

        System.out.println("\n =========================");
        bucle:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            int j = 0;
            while (j < 5) {
                if (i == 2) {
                    continue bucle;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
                j++;
            }
        }


        System.out.println("\n =========================");
        etiqueta:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }
    }
}
