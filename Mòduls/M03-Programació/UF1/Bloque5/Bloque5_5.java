package Bloque5;

import java.util.Scanner;

public class Bloque5_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int notas = 0,notable = 0;
        float mediana=0;

        int[] nota = new int[20];

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Añade una nota");
            nota[i] = in.nextInt();
            notas += nota[i];

            if ((nota[i] >= 7) && (nota[i] < 9)) {
                notable++;
            }
        }
        mediana = (float) notas / nota.length;

        System.out.println("La nota media es : " + notas);
        System.out.println("Y la cantidad de notables que ha habido son : " + notable);
    }

}
