package Bloque5;

import java.util.Scanner;

public class Bloque5_Mediana {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float notas = 0;

        float[] nota = new float[10];
        for (int i = 0; i < nota.length; i++) {
            System.out.println("Añade una nota");
            nota[i] = in.nextInt();
            notas += nota[i];
        }
        notas = notas / nota.length;

        System.out.println("La nota media es : " + notas);
    }

}
