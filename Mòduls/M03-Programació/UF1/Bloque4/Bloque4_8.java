package Bloque4;

import java.util.Scanner;

public class Bloque4_8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int perf = 0, suma = 0, i = 0;

        System.out.println("Añade un número");
        perf = in.nextInt();

        for (i = 1; i < perf; i++) {
            if (perf % i == 0) {
                suma += i;
            }
        }
        if (suma == perf) {
            System.out.println("Es un numero perfecto");
        } else {
            System.out.println("No es perfecto");
        }
    }
}
