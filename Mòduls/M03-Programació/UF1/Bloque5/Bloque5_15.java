package Bloque5;

import java.util.Scanner;

public class Bloque5_15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int par;
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 2;
            System.out.print(numeros[i] + ",");
        }

    }

}
