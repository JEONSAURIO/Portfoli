package Bloque5;

import java.util.Scanner;

public class Bloque5_17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d ,", numeros[i]);
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > i) {

                System.out.println(numeros[i] + " es mayor que la posicion " + i);
            }
        }

    }

}
