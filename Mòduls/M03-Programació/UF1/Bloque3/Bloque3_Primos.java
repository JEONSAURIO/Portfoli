package Bloque3;

import java.util.Scanner;

public class Bloque3_Primos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor, cont;
        boolean esPrimer;

        esPrimer = true;
        System.out.println("Añade un número");
        valor = in.nextInt();
        cont = 2;

        while ((cont <= valor / 2) && (esPrimer)) {
            if (valor % cont == 0) {
                esPrimer = false;
                System.out.println("No es primer");
            }
            cont++;
        }
        if (esPrimer) {
            System.out.println("Es primer");
        }
    }
}
