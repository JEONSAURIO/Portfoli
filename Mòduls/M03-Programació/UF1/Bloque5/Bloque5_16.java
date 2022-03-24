package Bloque5;

import java.util.Scanner;

public class Bloque5_16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] numeros = new double[20];
        int positius = 0, negatius = 0, zeros = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random() * 10 - 5;
            if (numeros[i] > 0) {
                positius++;
            }
            if (numeros[i] < 0) {
                negatius++;
            }
            if (numeros[i] == 0) {
                zeros++;
            }
            System.out.printf("%.2f ,", numeros[i]);
        }

    }

}
