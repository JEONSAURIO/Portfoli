package Bloque5;

import java.util.Scanner;

public class Bloque5_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int notas = 0;
        float mediana=0;

        int[] nota = new int[5];
        for (int i = 0; i < nota.length; i++) {
            System.out.println("Añade una nota");
            nota[i] = in.nextInt();
            notas += nota[i];
        }
        mediana = (float) notas / nota.length;

        System.out.println("La nota media es : " + notas);
    }

}
