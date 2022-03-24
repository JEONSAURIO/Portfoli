package Bloque4;

import java.util.Scanner;

public class Bloque4_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor = 0, cont = 2, cuentaPrimeros = 0;
        boolean esPrimer = true;

        while (cuentaPrimeros < 20) {
            valor++;
            cont = 2;
            esPrimer = true;

            while ((cont <= valor / 2) && (esPrimer == true)) {
                if (valor % cont == 0) {
                    esPrimer = false;
                }
                cont++;
            }
            if (esPrimer == true) {
                cuentaPrimeros++;
                System.out.println(valor);

            }
        }

    }
}
