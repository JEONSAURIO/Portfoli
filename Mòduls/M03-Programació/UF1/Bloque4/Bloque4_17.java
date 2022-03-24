package Bloque4;

import java.util.Scanner;

public class Bloque4_17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ciudadP = 0, ciudadM = 0, ciudadG = 0, cont = 0, habitantes = 0, totalHab = 0;

        float porcentajeP, porcentajeM, porcentajeG;

        for (int i = 0; i < 10; i++) {
            System.out.println("Cuantos habitantes hay?");
            habitantes = in.nextInt();
            totalHab += habitantes;
            if (habitantes < 2000) {
                System.out.println("Ciudad Pequeña");
                ciudadP += habitantes;

            } else if (habitantes <= 30000) {
                System.out.println("Ciudad Mediana");
                ciudadM += habitantes;

            } else {
                System.out.println("Ciudad Grande");
                ciudadG += habitantes;
            }

        }
        porcentajeP = ((float) ciudadP / habitantes) * 100;
        porcentajeM = ((float) ciudadM / habitantes) * 100;
        porcentajeG = ((float) ciudadG / habitantes) * 100;
        System.out.printf("El porcentaje de ciudades pequeñas es de un %.2f ", porcentajeP);
        System.out.printf("El porcentaje de ciudades medianas es de un %.2f ", porcentajeM);;
        System.out.printf("El porcentaje de ciudades grandes es de un %.2f ", porcentajeG);
    }
}
