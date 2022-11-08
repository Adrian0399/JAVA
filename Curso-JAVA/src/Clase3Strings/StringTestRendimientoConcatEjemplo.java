package Clase3Strings;

public class StringTestRendimientoConcatEjemplo {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++){
            // c = c.concat(a).concat(b).concat("\n"); // 500 = 2ms, 1000 = 4ms
            // c += a + b + "\n"; //500 = 19ms, 10000 = 21ms
            sb.append(a); // 500 = 0ms, 1000 = 0ms
            sb.append(b);
            sb.append("\n");
        }

        System.gc();


        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

        System.exit(0);
    }
}
