package Bloque3;

import java.util.Scanner;

public class Bloque3_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int horasT = 0, trabajadores, horasExtra;
        double QuantH, QuantF = 0;
        boolean seguim = true;

        for (int i = 0; seguim; i++) {
            System.out.println("Cuantas horas ha trabajado?");
            horasT = in.nextInt();

            System.out.println("Cuánto cobra a la hora?");
            QuantH = in.nextDouble();

            horasExtra = horasT - 40;

            if (horasT > 40) {
                QuantF = (QuantH * 40) + (horasExtra * QuantH * 1.5);
            } else {
                QuantF = QuantH * horasT;
            }
            System.out.println("Cobra " + QuantF + " en " + horasT + " horas.");

            System.out.println("Hay más trabajadores? (1-Si, 2-No");
            trabajadores = in.nextInt();
            if (trabajadores != 1) {
                seguim = false;
            }
        }
    }
}
