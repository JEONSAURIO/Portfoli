package Bloque5;

import java.util.Scanner;

public class Bloque5_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma = 0;
        int[] elementos = new int[100];

        for (int i = 0; i < elementos.length; i++) {
            if (i % 3 == 0) {
                suma += i;
                System.out.println(i + " es multiplo de 3");
            }

        }
        System.out.println("La suma de todos ellos da " + suma);
    }

}
