package Bloque5;

import java.util.Scanner;

public class Bloque5_6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma = 0, minimo = 0;
        float mediana = 0;

        int[] numero = new int[20];

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Añade una nota");
            numero[i] = in.nextInt();

            if (numero[i] <= 25) {
                suma += numero[i];

            }
        }
        mediana = (float) suma / numero.length;
    }

}
