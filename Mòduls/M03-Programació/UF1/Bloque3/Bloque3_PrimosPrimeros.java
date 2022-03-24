package Bloque3;

import java.util.Scanner;

public class Bloque3_PrimosPrimeros {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor = 0, cont = 2, cuentaPrimeros = 0;
        boolean esPrimer = true;

        while (cuentaPrimeros < 30) {
            valor++;
            cont = 2;
            esPrimer = true;

            while ((cont <= valor / 2) && (esPrimer)) {
                if (valor % cont == 0) {
                    esPrimer = false;
                }
                cont++;
            }
            if (esPrimer) {
                System.out.println(valor);
                cuentaPrimeros++;
            }
        }
    }
}
