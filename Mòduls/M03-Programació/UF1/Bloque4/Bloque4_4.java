package Bloque4;

import java.util.Scanner;

public class Bloque4_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, min = 0, max = 0, suma = 0, nums = 0;

        System.out.println("Cuantos numeros quieres añadir");
        nums = in.nextInt();

        for (int i = 0; i < nums; i++) {
            System.out.println("Añade un número");
            num = in.nextInt();
            if (i == 0) {
                max = num;
                min = num;
            }

            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
            suma += num;

        }
        System.out.println("El máximo es " + max);
        System.out.println("El mínimo es " + min);
        System.out.println("La media es " + (suma / nums));

    }

}
