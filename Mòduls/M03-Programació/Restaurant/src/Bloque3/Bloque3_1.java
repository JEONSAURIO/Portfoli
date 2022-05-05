package Bloque3;

import java.util.Scanner;

public class Bloque3_1 {

    public static final int dias = 31;
    public static final int mesas = 50;

    public static void main(String[] args) {
        double suma = 0, max = 0, max2 = 0;
        int maxdia = 0, maxdia2 = 0, maxmesa = 0;
        Scanner in = new Scanner(System.in);

        double[][] restaurante = new double[dias][mesas];

        for (int i = 0; i < dias; i++) {
            suma = 0;
            for (int j = 1; j != 0; j++) {

                restaurante[i][j] = (double) (Math.random() * 30);
                suma += restaurante[i][j];

                if (restaurante[i][j] > max2) {
                    max2 = restaurante[i][j];
                    maxdia2 = i;
                    maxmesa = j;
                }

                System.out.println("Hay más mesas? 0.No 1.Sí");
                int aca = in.nextInt();
                if (aca == 0) {
                    break;
                }

            }
            System.out.printf("La suma total del dia %d es: %.2f \n", i, suma);
            if (suma > max) {
                max = suma;
                maxdia = i;
            }
        }
        System.out.printf("El dia %d ha tenido el máximo de ingresos con : %.2f \n", maxdia, max);
        System.out.printf("El día %d en la mesa %d han tenido el máximo ingreso con: %.2f \n", maxdia2, maxmesa, max2);

    }
}
