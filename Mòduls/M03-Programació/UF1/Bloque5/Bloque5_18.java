package Bloque5;

import java.util.Scanner;

public class Bloque5_18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aprobado = 0;
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d ,", numeros[i]);

        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= 5) {
                aprobado++;
            }
        }
        float mediana = ((float) aprobado / numeros.length) * 100;
        System.out.println("");
        System.out.println("Porciento: " + mediana);
    }

}
