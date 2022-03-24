package Bloque3;

import java.util.Scanner;

public class Bloque3_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, suma = 0;

        System.out.println("Añade un número");
        i = in.nextInt();

        do {
            System.out.println("Añade un número");
            i = in.nextInt();
            if (i % 2 == 0) {
                suma++;
            }
        } while (i != 0);

        System.out.println(suma + " valores son pares");

    }
}
