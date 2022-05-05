package Bloque2;

import java.util.Scanner;

public class Bloque2_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float[] precios = new float[5];
        boolean salir = false;
        int clientes = 0;

        for (int i = 0; i < precios.length; i++) {
            System.out.println("Añade un precio");
            precios[i] = in.nextFloat();
            if (precios[i] == -1) {
                salir = true;
                break;
            }
            clientes++;
        }
        float mayor = 0, menor = 0, mitjana = 0, total = 0;
        for (int i = 0; i < clientes--; i++) {

            if (i == 0) {
                mayor = precios[i];
                menor = precios[i];
            }

            if (precios[i] > mayor) {
                mayor = precios[i];
            }

            if (precios[i] < menor) {
                menor = precios[i];
            }

            total += precios[i];

        }
        mitjana = total / clientes;

        System.out.println("En total hemos hecho un ingreso de: " + total + "€");
        System.out.println("Con una media de: " + mitjana + "€");
        System.out.println("Y un mínimo de " + menor + ". Y un máximo de " + mayor);
    }
}
