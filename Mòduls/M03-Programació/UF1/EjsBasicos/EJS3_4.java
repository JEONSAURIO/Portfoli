package EjsBasicos;

import java.util.Scanner;

public class EJS3_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, cont = 0, nombre = 0;
        numero = in.nextInt();
        int[] primos = new int[numero];

        while (nombre != numero) {
            cont++;
            if (esNombrePrimer(cont)) {
                primos[nombre] = cont;
                nombre++;
            }
        }
        dieznum(primos);
    }

    public static boolean esNombrePrimer(int nombre) {
        int div = 0;
        for (int i = 1; i <= nombre; i++) {
            if (nombre % i == 0) {
                div++;
            }
        }
        if (div == 2) {
            return true;
        } else {
            return false;
        }

    }

    public static void dieznum(int[] primos) {
        int cont = 0;

        for (int i = 0; i < primos.length; i++) {
            cont++;
            if (i == primos.length - 1) {
                System.out.print(primos[i] + ".");
            } else {
                System.out.print(primos[i] + ", ");
            }
            if (cont == 10) {
                System.out.println("");
                cont = 0;
            }
        }

    }
}
